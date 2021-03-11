package sec_02_01.step_12;

public class Main {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }
}