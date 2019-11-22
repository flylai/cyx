package cyx.Domain;

import cyx.Parser.CYXParser;

import java.util.HashMap;
import java.util.List;

public class CYXScope {
    private CYXScope parent;
    private HashMap<String, CYXValue> vars;
    private HashMap<String, CYXFunctionCall> funs;

    public CYXScope() {
        this(null);
    }

    public CYXScope(CYXScope scope) {
        parent = scope;
        vars = new HashMap<>();
        funs = new HashMap<>();
    }

    public void declFun(CYXParser.BlockContext funBlockCtx, String funName, int argsSize, List<String> argsName) {
        funs.put(funName, new CYXFunctionCall(funBlockCtx, argsSize, argsName));
    }

    // 赋值
    public void declVar(String varName, CYXValue value) {
        vars.put(varName, value);
    }

    public void assignVar(String varName, CYXValue value) {
        if (getVarVal(varName) == null || vars.containsKey(varName)) // 是否已声明
        {
            vars.put(varName, value);
        } else {
            assignVar(parent, varName, value);
        }
    }

    public void assignVar(CYXScope scope, String varName, CYXValue value) {
        if (scope.vars.containsKey(varName)) {
            scope.assignVar(varName, value);
        } else if (scope.parent != null) {
            assignVar(scope.parent, varName, value);
        }
    }

    // 获取变量值
    public CYXValue getVarVal(String varName) {
        if (vars.containsKey(varName)) // 当前作用域
        {
            return vars.get(varName);
        } else if (parent != null) {
            return parent.getVarVal(varName); // 递归往回找
        } else {
            return null;
        }
    }

    public CYXFunctionCall getFunCall(String funName) {
        if (funs.containsKey(funName)) {
            return funs.get(funName);
        } else if (parent != null) {
            return parent.getFunCall(funName); // 递归往回找
        } else {
            return null;
        }
    }

    // 获取父作用域
    public CYXScope parent() {
        return parent;
    }


}
