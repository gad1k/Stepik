package sec_05_03.step_10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float pageRank = 0;
        String line, lastKey = "", lastStructure = "";
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split("\t");
            if (!lastKey.equals(parsedLine[0])) {
                if (!lastKey.equals(""))
                    System.out.println(lastKey + "\t" + String.format("%.3f", 0.02 + 0.9 * pageRank) + "\t" + lastStructure);
                if (!lastKey.equals(parsedLine[0]))
                    pageRank = 0;
            }
            if (parsedLine[2].length() > 2)
                lastStructure = parsedLine[2];
            else
                pageRank += Float.parseFloat(parsedLine[1]);
            lastKey = parsedLine[0];
        }
        System.out.println(lastKey + "\t" + String.format("%.3f", 0.02 + 0.9 * pageRank) + "\t" + lastStructure);
    }
}