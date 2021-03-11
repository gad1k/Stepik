package sec_04_01.step_09;

public class Main {
    public static double sqrt(double x) {
        if (x < 0)
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        else
            return Math.sqrt(x);
    }
}