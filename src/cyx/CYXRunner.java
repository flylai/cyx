package cyx;

import cyx.Domain.CYXScope;
import cyx.Interpreter.CYXInterpreterVisitor;
import cyx.Parser.CYXLexer;
import cyx.Parser.CYXParser;
import cyx.Util.CYXGrammarErrorListener;
import cyx.Util.Log;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class CYXRunner {

    private InputStream in;

    public CYXRunner(InputStream in) {
        this.in = in;
    }

    public static void main(String[] args) throws Exception {
        String inFile = null;
        for (int i = 0; i < args.length; ++i) {
            String arg = args[i];
            switch (arg) {
                case "-h":
                case "-help":
                case "--help":
                    helpText();
                    break;

                default:
                    if (inFile != null) helpText();
                    inFile = arg;
            }
        }
        InputStream inputStream;

        if (inFile == null) {
            inputStream = System.in;
            System.out.println("CYX Interpreter -- Command Mode");
            System.out.println("You can type the statement(s) on it and press Ctrl+D(Linux) Ctrl+Z Enter(Windows) to run.");
            System.out.println();
        } else {
            inputStream = new FileInputStream(inFile);
        }

        new CYXRunner(inputStream).run();

    }

    private static void helpText() {
        System.out.println("CYX -- A simple toy script Language");
        System.out.println("    Usage: cyx [option] [input]");
        System.out.println("        Options:");
        System.out.println("            -help");
        System.out.println("            -h");
        System.out.println("            --help                  Print this help message");
        System.out.println("    Example:");
        System.out.println("        cyx func.cyx");
        System.exit(0);
    }

    private void run() {
        try {
            CharStream input = CharStreams.fromStream(in);
            CYXLexer lexer = new CYXLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CYXParser parser = new CYXParser(tokenStream);
            CYXGrammarErrorListener grammarErrorListener = new CYXGrammarErrorListener();
            parser.addErrorListener(grammarErrorListener);
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
