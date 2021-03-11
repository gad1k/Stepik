package sec_04_variables_and_types.step_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] parsedLine = reader.readLine().split("\\s+");
        reader.close();
        int[] numbers = new int[parsedLine.length];
        for (int i = 0; i < parsedLine.length; i++)
            numbers[i] = Integer.parseInt(parsedLine[parsedLine.length - i - 1]);
        for (int number : numbers)
            System.out.print(number + " ");
    }
}