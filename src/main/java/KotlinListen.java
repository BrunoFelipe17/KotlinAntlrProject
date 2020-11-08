import gen.KotlinBaseListener;
import gen.KotlinParser;

import java.util.List;

public class KotlinListen extends KotlinBaseListener {
    private GenerateJava generateJava = new GenerateJava();
    private boolean hasScan = false;


    @Override
    public void enterFunc_main(KotlinParser.Func_mainContext ctx) {
        generateJava.write("package generatedJava;\n");
        generateJava.write("import java.util.Scanner;\n");
        generateJava.write("class Main {");
        generateJava.write("\tpublic static void main(String[] args) {");
    }

    @Override
    public void exitFunc_main(KotlinParser.Func_mainContext ctx) {
        generateJava.write("\t}");
    }

    @Override
    public void exitProgram(KotlinParser.ProgramContext ctx) {
        generateJava.write("}");
    }

    @Override
    public void enterVarDeclaration(KotlinParser.VarDeclarationContext ctx) {
        if (!hasScan) {
            if (ctx.expr().getText().equals("scan()")) {
                generateJava.write("\t\tScanner scanner = new Scanner(System.in);");
                hasScan = true;
            }

        }
    }

    @Override
    public void exitVarDeclaration(KotlinParser.VarDeclarationContext ctx) {
        if (ctx.expr().getText().equals("scan()")) {
            if (ctx.type().getText().equals("Int")) {
                generateJava.write("\t\tint " + ctx.ID() + " = scanner.nextInt();");
            } else if (ctx.type().getText().equals("Double")) {
                generateJava.write("\t\tdouble " + ctx.ID() + " = scanner.nextDouble();");
            } else if (ctx.type().getText().equals("String")) {
                generateJava.write("\t\tString " + ctx.ID() + " \" = scanner.nextLine();");
            }
        } else {
            if (ctx.type().getText().equals("Int")) {
                generateJava.write("\t\tint " + ctx.ID() + " = " + ctx.expr().getText() + ";");
            } else if (ctx.type().getText().equals("Double")) {
                generateJava.write("\t\tdouble " + ctx.ID() + " = " + ctx.expr().getText() + ";");
            } else if (ctx.type().getText().equals("String")) {
                generateJava.write("\t\tString " + ctx.ID() + " = " + ctx.expr().getText() + ";");
            }
        }
    }

    @Override
    public void exitReassignment(KotlinParser.ReassignmentContext ctx) {
        generateJava.write("\t\t" + ctx.ID() + " = " + ctx.expr().getText() + ";");
    }

    @Override
    public void enterIncrementOrDecrement(KotlinParser.IncrementOrDecrementContext ctx) {
        if (ctx.op.getType() == KotlinParser.INCREMENT) {
            generateJava.write("\t\t" + ctx.ID() + "++;");
        } else {
            generateJava.write("\t\t" + ctx.ID() + "--;");
        }
    }

    @Override
    public void enterSimpleOp(KotlinParser.SimpleOpContext ctx) {
        String id = ctx.expr(0).getText();
        String value = ctx.expr(1).getText();
        if (ctx.op.getType() == KotlinParser.MULT) {
            generateJava.write("\t\t" + id + " = " + id + " * " + value + ";");
        } else if (ctx.op.getType() == KotlinParser.DIV) {
            generateJava.write("\t\t" + id + " = " + id + " / " + value + ";");
        } else if (ctx.op.getType() == KotlinParser.ADD) {
            generateJava.write("\t\t" + id + " = " + id + " + " + value + ";");
        } else if (ctx.op.getType() == KotlinParser.SUB) {
            generateJava.write("\t\t" + id + " = " + id + " - " + value + ";");
        }
    }

    @Override
    public void enterWhile_statement(KotlinParser.While_statementContext ctx) {
        generateJava.write("\t\twhile (" + ctx.comṕarison().getText() + ") {");
    }

    @Override
    public void exitWhile_statement(KotlinParser.While_statementContext ctx) {
        generateJava.write("\t\t}");
    }

    @Override
    public void enterRepeat_statement(KotlinParser.Repeat_statementContext ctx) {
        generateJava.write("\t\tfor (int i = 0; i < " + ctx.INT() + "; i++) {");
    }

    @Override
    public void exitRepeat_statement(KotlinParser.Repeat_statementContext ctx) {
        generateJava.write("\t\t}");
    }

    @Override
    public void enterIf_statement(KotlinParser.If_statementContext ctx) {
        generateJava.write("\t\tif (" + ctx.comṕarison().getText() + ") {");
    }

    @Override
    public void exitIf_statement(KotlinParser.If_statementContext ctx) {
        generateJava.write("\t\t}");
    }

    @Override
    public void enterElse_block(KotlinParser.Else_blockContext ctx) {
        generateJava.write("\t\t} else {");
    }


    @Override
    public void enterPrintNormal(KotlinParser.PrintNormalContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<KotlinParser.ExprContext> value = ctx.printnormal().expr();

        for (int i = 0; i < value.size(); i++) {
            sb.append(ctx.printnormal().expr(i).getText());
            if (value.size() > 0 && i < value.size() - 1) {
                sb.append("+");
            }
        }
        generateJava.write("\t\tSystem.out.print(" + sb.toString() + ");");
    }

    @Override
    public void enterPrintLine(KotlinParser.PrintLineContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<KotlinParser.ExprContext> value = ctx.printline().expr();

        for (int i = 0; i < value.size(); i++) {
            sb.append(ctx.printline().expr(i).getText());
            if (value.size() > 0 && i < value.size() - 1) {
                sb.append("+");
            }
        }
        generateJava.write("\t\tSystem.out.println(" + sb.toString() + ");");
    }


}
