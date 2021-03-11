package sec_04_02.step_02;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String logLine;
        while ((logLine = reader.readLine()) != null)
            if(logLine.split("\t")[1].equals("user10"))
                System.out.println(logLine);
    }
}