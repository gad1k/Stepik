package sec_03_05.step_07;

import java.util.function.DoubleUnaryOperator;

public class Main {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double res = 0, h = 10e-7;
        double n = (b - a) / h;
        for (int i = 0; i < n; i++)
            res += h * f.applyAsDouble(a + h * i);
        return res;
    }
}