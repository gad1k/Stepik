package sec_04_03.step_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String line, lastKey = "";
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split("\t");
            if (!lastKey.equals(parsedLine[0])) {
                if (!lastKey.equals(""))
                    System.out.println(lastKey.split("#")[0] + "\t" + lastKey.split("#")[1] + "\t" + count);
                count = 1;
            } else {
                count++;
            }
            lastKey = parsedLine[0];
        }
        System.out.println(lastKey.split("#")[0] + "\t" + lastKey.split("#")[1] + "\t" + count);
    }
}