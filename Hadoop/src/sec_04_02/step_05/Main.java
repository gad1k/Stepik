package sec_04_02.step_05;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line, lastKey = "";
        while ((line = reader.readLine()) != null) {
            if (lastKey.equals(line.split("\t")[0]))
                System.out.println(line.split("\t")[0]);
            lastKey = line.split("\t")[0];
        }
    }
}