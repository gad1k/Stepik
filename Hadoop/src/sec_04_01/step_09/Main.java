package sec_04_01.step_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] keyValues = line.split("\t");
            for (String values : keyValues[1].split(","))
                System.out.println(keyValues[0] + "," + values + "\t1");
        }
    }
}