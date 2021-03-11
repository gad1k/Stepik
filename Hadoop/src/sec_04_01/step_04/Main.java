package sec_04_01.step_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                if (map.containsKey(word))
                    map.put(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }
            for (Map.Entry<String, Integer> pair : map.entrySet()) {
                System.out.println(pair.getKey() + "\t" + pair.getValue());
            }
        }
    }
}