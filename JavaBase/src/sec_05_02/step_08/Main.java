package sec_05_02.step_08;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int reader;
        while ((reader = inputStream.read()) != -1)
            result = Integer.rotateLeft(result, 1) ^ reader;
        return result;
    }
}