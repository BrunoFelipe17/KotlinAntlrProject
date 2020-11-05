import gen.KotlinLexer;
import gen.KotlinParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;

public class KotlinCompiler {
    public static void main(String[] args) throws Exception {
        String currentDir = System.getProperty("user.dir");
        CharStream input = CharStreams.fromStream(
                new FileInputStream(currentDir + "/src/main/kotlin/Main.kt")
        );

        KotlinLexer lexer = new KotlinLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        KotlinParser parser = new KotlinParser(tokens);
        ParseTree tree = parser.program();

        KotlinVisitor kotlinVisitor = new KotlinVisitor();
        kotlinVisitor.visit(tree);
//        System.out.println(tree.toStringTree());
    }
}
