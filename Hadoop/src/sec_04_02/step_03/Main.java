package sec_04_02.step_03;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String logLine;
        while ((logLine = reader.readLine()) != null)
            System.out.println(logLine.split("\t")[2]);
    }
}