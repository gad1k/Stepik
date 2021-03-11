package sec_04_01.step_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dur = 0, cnt = 0;
        String line, lastSite = "";
        String[] split, timeAndCount;
        while ((line = reader.readLine()) != null) {
            split = line.split("\t");
            timeAndCount = split[1].split(";");
            if ((lastSite.equals("")) || (lastSite.equals(split[0]))) {
                dur += Integer.parseInt(timeAndCount[0]);
                cnt++;
            } else {
                System.out.println(lastSite + "\t" + dur + ";" + cnt);
                dur = Integer.parseInt(timeAndCount[0]);
                cnt = 1;
            }
            lastSite = split[0];
        }
        System.out.println(lastSite + "\t" + dur + ";" + cnt);
    }
}