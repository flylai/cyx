package cyx;

import cyx.Domain.CYXScope;
import cyx.Interpreter.CYXInterpreterVisitor;
import cyx.Parser.CYXLexer;
import cyx.Parser.CYXParser;
import cyx.Util.Log;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;

public class CYXRunner {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(new FileInputStream(args[0]));
            CYXLexer lexer = new CYXLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CYXParser parser = new CYXParser(tokenStream);
            ParseTree tree = parser.program();

            CYXScope scope = new CYXScope();
            CYXInterpreterVisitor interpreterVisitor = new CYXInterpreterVisitor(scope);
            interpreterVisitor.visit(tree);
        } catch (Exception e) {
            Log.d(e.getMessage());
            e.printStackTrace();
        }
    }
}
