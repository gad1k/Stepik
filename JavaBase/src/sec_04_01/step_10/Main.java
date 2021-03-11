package sec_04_01.step_10;

public class Main {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        try {
            return stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();
        } catch (Exception e) {
            return null;
        }
    }
}