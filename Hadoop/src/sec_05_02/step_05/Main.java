package sec_05_02.step_05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split("\t");
            String[] edges = parsedLine[2].replaceAll("[{,}]", " ").trim().split(" ");
            System.out.println(line);
            if (parsedLine[2].replaceAll("[{,}]", " ").trim().length() == 0)
                continue;
            else
                for (String edge : edges)
                    System.out.println(edge + "\t" + (parsedLine[1].equals("INF") ? "INF" : Integer.parseInt(parsedLine[1]) + 1) + "\t{}");
        }
    }
}