package sec_04_02.step_07;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String line;
        String[] lastKeyValue = new String[] {"", ""};
        while ((line = reader.readLine()) != null) {
            if (!lastKeyValue[0].equals(line.split("\t")[0])) {
                if (count == 1 && (lastKeyValue[1].equals("A") || lastKeyValue[1].equals("B")))
                    System.out.println(lastKeyValue[0]);
                count = 1;
            } else
                count++;
            lastKeyValue = line.split("\t");
        }
        if (count == 1 && (lastKeyValue[1].equals("A") || lastKeyValue[1].equals("B")))
            System.out.println(lastKeyValue[0]);
    }
}