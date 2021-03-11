package sec_04_01.step_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dur = 0, cnt = 0;
        String line, lastSite = "";
        String[] split;
        while ((line = reader.readLine()) != null) {
            split = line.split("\t");
            if ((lastSite.equals("")) || (lastSite.equals(split[0]))) {
                dur += Integer.parseInt(split[1]);
                cnt++;
            } else {
                System.out.println(lastSite + "\t" + (int) (dur / cnt));
                dur = Integer.parseInt(split[1]);
                cnt = 1;
            }
            lastSite = split[0];
        }
        System.out.println(lastSite + "\t" + (int) (dur / cnt));
    }
}