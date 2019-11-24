package cyx.Domain;

import cyx.Interpreter.CYXStmtVisitor;
import cyx.Parser.CYXParser;
import cyx.Util.CYXRuntimeException;

import java.util.ArrayList;
import java.util.List;

public class CYXFunctionCall {
    private int argsSize;
    private List<String> argsName = new ArrayList<>();
    private CYXParser.BlockContext funBlock; // 语句块上下文

    public CYXFunctionCall(CYXParser.BlockContext funBlockCtx, int argsSize, List<String> argsName) {
        this.argsSize = argsSize;
        this.funBlock = funBlockCtx;
        this.argsName.addAll(argsName);
    }

    public CYXValue invoke(CYXScope parentScope, List<CYXValue> args) {
        CYXScope subScope = new CYXScope(parentScope); // 新作用域
        if (args.size() != argsSize) {
            throw new CYXRuntimeException("ERROR: 参数个数错误");
        }
        for (int i = 0; i < args.size(); i++) { // 新作用域 参数赋值
            subScope.declVar(argsName.get(i), args.get(i));
        }
        CYXStmtVisitor stmtVisitor = new CYXStmtVisitor(subScope);
        CYXValue retval = stmtVisitor.visit(funBlock); // 对函数块进行求值求解
        return retval; // 可能的函数返回值
    }


}
