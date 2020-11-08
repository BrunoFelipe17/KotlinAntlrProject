import gen.KotlinBaseVisitor;
import gen.KotlinParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KotlinVisitor extends KotlinBaseVisitor<KotlinValue> {
    private Map<String, KotlinValue> variables = new HashMap<String, KotlinValue>();
    private Map<String, KotlinValue> temporaryVars = new HashMap<String, KotlinValue>();
    private GenerateJava generateJava = new GenerateJava();
    private int ccc = 0;

    @Override
    public KotlinValue visitVarDeclaration(KotlinParser.VarDeclarationContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        KotlinValue value = new KotlinValue(null);

        if (ctx.expr().getText().equals("scan()")) {
            Scanner scanner = new Scanner(System.in);
            value = new KotlinValue(scanner.next());
        } else {
            value = new KotlinValue(visit(ctx.expr()));

        }

        if (type.equals("Int")) {
            setInt(value, id, type);
        } else if (type.equals("Double")) {
            setDouble(value, id, type);
        } else if (type.equals("String")) {
            setString(value, id, type);
        } else {
            System.err.println("Unknown type <" + type + ">");
            System.exit(1);
        }

        return visit(ctx.expr());
    }


    @Override
    public KotlinValue visitReassignment(KotlinParser.ReassignmentContext ctx) {
        String id = ctx.ID().getText();
        KotlinValue variableValue = variables.get(id);

        if (variableValue != null) {
            if (ctx.expr().getText().equals("scan()")) {
                Scanner scanner = new Scanner(System.in);
                KotlinValue newValue = new KotlinValue(null);
                try {
                    if (variableValue.isInt()) {
                        newValue = new KotlinValue(scanner.nextInt());
                    } else if (variableValue.isDouble()) {
                        newValue = new KotlinValue(scanner.nextDouble());
                    } else if (variableValue.isString()) {
                        newValue = new KotlinValue(scanner.nextLine());
                    }
                } catch (Exception e) {
                    System.err.println("Error converting to <" + variableValue.getType() + ">");
                    System.exit(1);
                    generateJava.erase();
                }

                variables.put(id, newValue);

            } else {
                KotlinValue newValue = new KotlinValue(visit(ctx.expr()));
                if (variableValue.isInt()) {
                    setInt(newValue, id, "Int");
                } else if (variableValue.isDouble()) {
                    setDouble(newValue, id, "Double");
                } else if (variableValue.isString()) {
                    setString(newValue, id, "String");
                }

            }
        } else {
            System.out.println("Não existe");
        }

        return null;
    }

    @Override
    public KotlinValue visitModulo(KotlinParser.ModuloContext ctx) {
        String id = ctx.expr(0).getText();
        KotlinValue moduloValue = new KotlinValue(visit(ctx.expr(1)));
        KotlinValue valueToCompare = new KotlinValue(visit(ctx.expr(2)));


        if (variables.get(id) != null) {
            if (variables.get(id).asInt() % moduloValue.asInt() == valueToCompare.asInt()) {
                return new KotlinValue(true);
            } else if (variables.get(id).asDouble() % moduloValue.asDouble() == valueToCompare.asDouble()) {
                return new KotlinValue(true);
            }
        } else {
            KotlinValue value = visit(ctx.expr(0));
            if (value.asInt() % moduloValue.asInt() == valueToCompare.asInt()) {
                return new KotlinValue(true);
            } else if (value.asDouble() % moduloValue.asDouble() == valueToCompare.asDouble()) {
                return new KotlinValue(true);
            }
        }
        return new KotlinValue(false);
    }


    @Override
    public KotlinValue visitSimpleOp(KotlinParser.SimpleOpContext ctx) {
        String id = ctx.expr(0).getText();
        KotlinValue right = visit(ctx.expr(1));
        KotlinValue value = variables.get(id);

        if (value.isString()) {
            System.err.println("Cannot do math operations on String");
            System.exit(1);
            generateJava.erase();
        }
        if (value != null) {
            if (ctx.op.getType() == KotlinParser.ADD) {
                if (value.isInt()) variables.put(id, new KotlinValue(value.asInt() + right.asInt()));
                if (value.isDouble()) variables.put(id, new KotlinValue(value.asDouble() + right.asDouble()));
            } else if (ctx.op.getType() == KotlinParser.SUB) {
                if (value.isInt()) variables.put(id, new KotlinValue(value.asInt() - right.asInt()));
                if (value.isDouble()) variables.put(id, new KotlinValue(value.asDouble() - right.asDouble()));
            } else if (ctx.op.getType() == KotlinParser.MULT) {
                if (value.isInt()) variables.put(id, new KotlinValue(value.asInt() * right.asInt()));
                if (value.isDouble()) variables.put(id, new KotlinValue(value.asDouble() * right.asDouble()));
            } else if (ctx.op.getType() == KotlinParser.DIV) {
                if (value.isInt()) variables.put(id, new KotlinValue(value.asInt() / right.asInt()));
                if (value.isDouble()) variables.put(id, new KotlinValue(value.asDouble() / right.asDouble()));
            }
        }


        return super.visitSimpleOp(ctx);
    }



    @Override
    public KotlinValue visitParenthesis(KotlinParser.ParenthesisContext ctx) {
        return visit(ctx.expr());
    }



    @Override
    public KotlinValue visitMultOrDiv(KotlinParser.MultOrDivContext ctx) {
        KotlinValue left = visit(ctx.expr(0));
        KotlinValue right = visit(ctx.expr(1));
        KotlinValue finalValue = null;

        if (left.isInt()) {
            if (ctx.op.getType() == KotlinParser.MULT) {
                finalValue = new KotlinValue(left.asInt() * right.asInt());
            } else if (ctx.op.getType() == KotlinParser.DIV) {
                finalValue = new KotlinValue(left.asInt() / right.asInt());
            }

        } else if (left.isDouble()) {
            if (ctx.op.getType() == KotlinParser.MULT) {
                finalValue = new KotlinValue(left.asDouble() * right.asDouble());
            } else if (ctx.op.getType() == KotlinParser.DIV) {
                finalValue = new KotlinValue(left.asDouble() / right.asDouble());
            }
        }
        return finalValue;
    }

    @Override
    public KotlinValue visitAddOrSub(KotlinParser.AddOrSubContext ctx) {

        KotlinValue left = visit(ctx.expr(0));
        KotlinValue right = visit(ctx.expr(1));

        KotlinValue finalValue = null;

        if (left.isInt()) {
            if (ctx.op.getType() == KotlinParser.ADD) {
                finalValue = new KotlinValue(left.asInt() + right.asInt());
            } else if (ctx.op.getType() == KotlinParser.SUB) {
                finalValue = new KotlinValue(left.asInt() - right.asInt());
            }

        } else if (left.isDouble()) {
            if (ctx.op.getType() == KotlinParser.ADD) {
                finalValue = new KotlinValue(left.asDouble() + right.asDouble());
            } else if (ctx.op.getType() == KotlinParser.SUB) {
                finalValue = new KotlinValue(left.asDouble() - right.asDouble());
            }
        }
        return finalValue;
    }

    @Override
    public KotlinValue visitIncrementOrDecrement(KotlinParser.IncrementOrDecrementContext ctx) {
        String id = ctx.ID().getText();
        KotlinValue value = variables.get(id);

        if (variables.get(id) != null) {
            if (ctx.op.getType() == KotlinParser.INCREMENT) {
                if (value.isInt()) {
                    Integer newValueInt = value.asInt();
                    newValueInt++;
                    variables.put(id, new KotlinValue(newValueInt));
                } else if (value.isDouble()) {
                    Double newValueDouble = value.asDouble();
                    newValueDouble++;
                    variables.put(id, new KotlinValue(newValueDouble));
                }
            } else {
                if (value.isInt()) {
                    Integer newValueInt = value.asInt();
                    newValueInt--;
                    variables.put(id, new KotlinValue(newValueInt));
                } else {
                    Double newValueDouble = value.asDouble();
                    newValueDouble--;
                    variables.put(id, new KotlinValue(newValueDouble));
                }
            }
        }


        return super.visitIncrementOrDecrement(ctx);
    }

    @Override
    public KotlinValue visitString(KotlinParser.StringContext ctx) {
        return new KotlinValue(ctx.STRING().getText());
    }

    @Override
    public KotlinValue visitPrintNormal(KotlinParser.PrintNormalContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<KotlinParser.ExprContext> value = ctx.printnormal().expr();

        for (KotlinParser.ExprContext exprContext : value) {
            sb.append(visit(exprContext));
        }

        System.out.print(sb.toString().replace("\"", ""));
        return null;
    }

    @Override
    public KotlinValue visitPrintLine(KotlinParser.PrintLineContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<KotlinParser.ExprContext> value = ctx.printline().expr();

        for (KotlinParser.ExprContext exprContext : value) {
            sb.append(visit(exprContext).asString());
        }

        System.out.println(sb.toString().replace("\"", ""));
        return null;
    }

    @Override
    public KotlinValue visitId(KotlinParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (variables.containsKey(id)) {
            return variables.get(id);
        }
        return null;
    }


    @Override
    public KotlinValue visitInt(KotlinParser.IntContext ctx) {
        KotlinValue value = new KotlinValue(ctx.INT().getText());
        Integer newValue = value.asInt();
        return new KotlinValue(newValue);
    }

    @Override
    public KotlinValue visitDouble(KotlinParser.DoubleContext ctx) {
        KotlinValue value = new KotlinValue(ctx.DOUBLE().getText());
        Double newValue = value.asDouble();
        return new KotlinValue(newValue);
    }

    @Override
    public KotlinValue visitType(KotlinParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public KotlinValue visitIf_statement(KotlinParser.If_statementContext ctx) {
        if (visit(ctx.comṕarison()).asBoolean()) {
            visit(ctx.block());
        } else if (ctx.else_block() != null) {
            visit(ctx.else_block());
        }

        return null;
    }

    @Override
    public KotlinValue visitElse_block(KotlinParser.Else_blockContext ctx) {
        visit(ctx.block());
        return null;
    }

    @Override
    public KotlinValue visitGreaterOrEqual(KotlinParser.GreaterOrEqualContext ctx) {
        KotlinValue left = visit(ctx.expr(0));
        KotlinValue right = visit(ctx.expr(1));
        String operator = ">=";

        return new KotlinValue(checkInt(left, right, operator) || checkDouble(left, right, operator));
    }

    @Override
    public KotlinValue visitGreater(KotlinParser.GreaterContext ctx) {
        KotlinValue left = visit(ctx.expr(0));
        KotlinValue right = visit(ctx.expr(1));
        String operator = ">";

        return new KotlinValue(checkInt(left, right, operator) || checkDouble(left, right, operator));
    }

    @Override
    public KotlinValue visitLessOrEqual(KotlinParser.LessOrEqualContext ctx) {
        KotlinValue left = visit(ctx.expr(0));
        KotlinValue right = visit(ctx.expr(1));
        String operator = "<=";

        return new KotlinValue(checkInt(left, right, operator) || checkDouble(left, right, operator));
    }

    @Override
    public KotlinValue visitLess(KotlinParser.LessContext ctx) {
        KotlinValue left = visit(ctx.expr(0));
        KotlinValue right = visit(ctx.expr(1));
        String operator = "<";

        return new KotlinValue(checkInt(left, right, operator) || checkDouble(left, right, operator));
    }

    @Override
    public KotlinValue visitEqual(KotlinParser.EqualContext ctx) {
        KotlinValue left = visit(ctx.expr(0));
        KotlinValue right = visit(ctx.expr(1));
        String operator = "==";

        return new KotlinValue(
                checkInt(left, right, operator) ||
                        checkDouble(left, right, operator) ||
                        checkString(left, right)
        );
    }

    @Override
    public KotlinValue visitWhile_statement(KotlinParser.While_statementContext ctx) {
        KotlinValue booleanExpression = visit(ctx.comṕarison());

        while (booleanExpression.asBoolean()) {
            visit(ctx.block());
            booleanExpression = visit(ctx.comṕarison());
        }

        return super.visitWhile_statement(ctx);
    }

    @Override
    public KotlinValue visitRepeat_statement(KotlinParser.Repeat_statementContext ctx) {
        try {
            KotlinValue value = new KotlinValue(ctx.INT());
            for (int i = 0; i < value.asInt(); i++) {
                visit(ctx.block());
            }
        } catch (Exception e) {
            System.err.println("<Repeat> statement works only with <Int>");
            System.exit(1);
            generateJava.erase();
        }

        return null;
    }

    private boolean checkInt(KotlinValue left, KotlinValue right, String operator) {
        try {
            if (operator.equals(">=")) {
                return left.asInt() >= right.asInt();
            } else if (operator.equals(">")) {
                return left.asInt() > right.asInt();
            } else if (operator.equals("<=")) {
                return left.asInt() <= right.asInt();
            } else if (operator.equals("<")) {
                return left.asInt() < right.asInt();
            } else if (operator.equals("==")) {
                return left.asInt().equals(right.asInt());
            }
        } catch (Exception e) {
            e.getMessage();
            generateJava.erase();
        }
        return false;
    }

    private boolean checkDouble(KotlinValue left, KotlinValue right, String operator) {
        try {
            if (operator.equals(">=")) {
                return left.asDouble() >= right.asDouble();
            } else if (operator.equals(">")) {
                return left.asDouble() > right.asDouble();
            } else if (operator.equals("<=")) {
                return left.asDouble() <= right.asDouble();
            } else if (operator.equals("<")) {
                return left.asDouble() < right.asDouble();
            } else if (operator.equals("==")) {
                return left.asDouble().equals(right.asDouble());
            }
        } catch (Exception e) {
            e.getMessage();
            generateJava.erase();
        }
        return false;
    }

    private boolean checkString(KotlinValue left, KotlinValue right) {
        try {
            return left.asDouble().equals(right.asDouble());
        } catch (Exception e) {
            e.getMessage();
            generateJava.erase();
        }
        return false;
    }

    private void setInt(KotlinValue value, String id, String type) {
        try {
            KotlinValue newValue = new KotlinValue(value.asInt());
            addVariable(id, newValue);
        } catch (Exception e) {
            addVariableException(type, value);
            generateJava.erase();
        }
    }

    private void setDouble(KotlinValue value, String id, String type) {
        try {
            KotlinValue newValue = new KotlinValue(value.asDouble());
            addVariable(id, newValue);
        } catch (Exception e) {
            addVariableException(type, value);
            generateJava.erase();
        }
    }

    private void setString(KotlinValue value, String id, String type) {
        String stringValue = value.asString();
        try {
            if (stringValue.startsWith("\"") && stringValue.endsWith("\"")) {
                KotlinValue newValue = new KotlinValue(stringValue);
                addVariable(id, newValue);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            addVariableException(type, value);
            generateJava.erase();
        }
    }

    private void addVariable(String id, KotlinValue newValue) {
        variables.put(id, newValue);
    }

    private void addVariableException(String type, KotlinValue value) {
        System.err.println("Cannot cast <" + value + "> to <" + type + ">");
        System.exit(1);
    }

}
