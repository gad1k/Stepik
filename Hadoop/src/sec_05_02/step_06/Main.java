package sec_05_02.step_06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] lastLine = new String[] {"", "", ""};
        while ((line = reader.readLine()) != null) {
            if (!lastLine[0].equals(line.split("\t")[0])) {
                if (!lastLine[0].equals(""))
                    System.out.println(lastLine[0] + "\t" + lastLine[1] + "\t" + lastLine[2]);
                lastLine = new String[] {"", "", ""};
            }
            lastLine[0] = line.split("\t")[0];
            if (lastLine[1].equals("") || lastLine[1].equals("INF"))
                lastLine[1] = line.split("\t")[1];
            if (line.split("\t")[2].length() > lastLine[2].length())
                lastLine[2] = line.split("\t")[2];
        }
        System.out.println(lastLine[0] + "\t" + lastLine[1] + "\t" + lastLine[2]);
    }
}