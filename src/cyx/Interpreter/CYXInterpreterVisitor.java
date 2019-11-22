package cyx.Interpreter;

import cyx.Domain.CYXScope;
import cyx.Domain.CYXValue;
import cyx.Parser.CYXBaseVisitor;
import cyx.Parser.CYXParser;

public class CYXInterpreterVisitor extends CYXBaseVisitor<CYXValue> {
    private CYXScope scope; // 全局作用域

    public CYXInterpreterVisitor(CYXScope scope) {
        this.scope = scope;
    }

    @Override
    public CYXValue visitProgram(CYXParser.ProgramContext ctx) {
        CYXStmtVisitor stmtVisitor = new CYXStmtVisitor(scope);
        for (CYXParser.StmtContext stmtContext : ctx.stmt()) {
            stmtVisitor.visit(stmtContext);
        }
        return null;
    }
}
