package sec_04_03.step_05;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String line, lastKey = "";
        List<String[]> list = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split("[\t;]");
            if (!lastKey.equals(parsedLine[0])) {
                for (String[] result : list)
                    System.out.println(result[0] + "#" + result[1] + "\t" + result[2] + "\t" + count);
                list.clear();
                count = 1;
            } else
                count++;
            list.add(new String[] {parsedLine[0], parsedLine[1], parsedLine[2]});
            lastKey = parsedLine[0];
        }
        for (String[] result : list)
            System.out.println(result[0] + "#" + result[1] + "\t" + result[2] + "\t" + count);
    }
}