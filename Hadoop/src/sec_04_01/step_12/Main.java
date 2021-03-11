package sec_04_01.step_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line, lastKeyValue = "";
        Map<String, Integer> map = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            if (lastKeyValue.equals("") || !lastKeyValue.equals(line)) {
                String[] keyValue = line.split("\t");
                if (map.containsKey(keyValue[1]))
                    map.put(keyValue[1], map.get(keyValue[1]) + 1);
                else
                    map.put(keyValue[1], 1);
                lastKeyValue = line;
            } else
                continue;
        }
        for (Map.Entry<String, Integer> pair : map.entrySet())
            System.out.println(pair.getKey() + "\t" + pair.getValue());
    }
}