package sec_04_03.step_04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split("\t");
            System.out.println(parsedLine[0] + "\t" + parsedLine[1] + ";" + parsedLine[2] + ";1");
        }
    }
}