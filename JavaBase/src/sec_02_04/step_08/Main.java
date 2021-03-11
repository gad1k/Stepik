package sec_02_04.step_08;

import java.math.BigInteger;

public class Main {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}