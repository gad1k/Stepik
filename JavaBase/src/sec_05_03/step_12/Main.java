package sec_05_03.step_12;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        int inputByte;
        StringBuilder sb = new StringBuilder();
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        while ((inputByte = reader.read()) != -1)
            sb.append((char) inputByte);
        return sb.toString();
    }
}