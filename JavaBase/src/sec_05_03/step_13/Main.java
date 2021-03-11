package sec_05_03.step_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split("[ \t]");
            for (String str : parsedLine)
                try {
                    sum += Double.parseDouble(str);
                } catch (IllegalArgumentException e) {
                }
        }
        System.out.println(String.format("%.6f", sum));
    }
}