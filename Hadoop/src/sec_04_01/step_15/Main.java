package sec_04_01.step_15;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] cortege = line.split(" ");
            for (String object : cortege) {
                Map<String, Integer> map = new HashMap<>();
                for (String value : cortege)
                    if (!object.equals(value)) {
                        if (map.containsKey(value))
                            map.put(value, map.get(value) + 1);
                        else
                            map.put(value, 1);
                    }
                StringBuilder stripe = new StringBuilder();
                for (Map.Entry<String, Integer> pair : map.entrySet())
                    stripe.append(pair.getKey() + ":" + pair.getValue() + ",");
                System.out.println(object + "\t" + stripe.toString().substring(0, stripe.length() - 1));
            }
        }
    }
}