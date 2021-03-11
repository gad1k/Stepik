package sec_06_04.step_11;

import java.util.stream.IntStream;

public class Main {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000);
    }
}