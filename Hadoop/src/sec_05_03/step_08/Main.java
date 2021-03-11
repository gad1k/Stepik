package sec_05_03.step_08;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parsedLine = line.split("\t");
            String[] vertexes = parsedLine[2].replaceAll("[{,}]", " ").trim().split(" ");
            System.out.println(line);
            for (String vertex : vertexes)
                System.out.println(vertex + "\t" + String.format("%.3f", Float.parseFloat(parsedLine[1]) / vertexes.length) + "\t{}");
        }
    }
}