package sec_04_03.step_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split(":", 2);
            for (String word : parsedLine[1].split("\\s+|\\W+"))
                System.out.println(word + "#" + parsedLine[0] + "\t1");
        }
    }
}