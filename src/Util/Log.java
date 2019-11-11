package Util;

public class Log {
    public static void d(String msg) {
        System.out.println("[" + getCaller() + "] —> " + msg);
    }

    public static String getCaller() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length >= 3) {
            String ret = stackTraceElements[3].getClassName();
            ret += "->" + stackTraceElements[3].getMethodName();
            ret += ":" + stackTraceElements[3].getLineNumber();
            return ret;
        }
        return "UNKOWN";
    }
}
