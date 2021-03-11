package sec_04_01.step_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line, lastKey = "";
        while ((line = reader.readLine()) != null) {
            String[] keyValues = line.split("\t");
            if (lastKey.equals("") || !lastKey.equals(keyValues[0])) {
                System.out.println(keyValues[0]);
                lastKey = keyValues[0];
            } else
                continue;
        }
    }
}