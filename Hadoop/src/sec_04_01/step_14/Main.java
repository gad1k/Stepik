package sec_04_01.step_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] cortege = line.split(" ");
            for (int i = 0; i < cortege.length; i++)
                for (int j = 0; j < cortege.length; j++) {
                    if (cortege[i].equals(cortege[j]))
                        continue;
                    else
                        System.out.println(cortege[i] + "," + cortege[j] + "\t1");
                }
        }
    }
}