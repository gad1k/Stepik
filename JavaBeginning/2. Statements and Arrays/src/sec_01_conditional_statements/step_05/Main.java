package sec_01_conditional_statements.step_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder line = new StringBuilder(reader.readLine());
        reader.close();
        int number = Integer.parseInt(line.toString());
        if (number < 0 || number > 9999)
            line.append("0");
        if (line.length() < 4)
            while (line.length() != 4)
                line.insert(0, "0");
        if (line.toString().equals(line.reverse().toString()))
            System.out.println(1);
        else
            System.out.println(37);
    }
}