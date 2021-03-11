package sec_04_map.step_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<String> dictionary = new HashSet<>();
        Set<String> erroneous = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader.readLine());
        for (int i = 0; i < d; i++)
            dictionary.add(reader.readLine().toLowerCase());
        int l = Integer.parseInt(reader.readLine());
        for (int i = 0; i < l; i++) {
            String[] words = reader.readLine().split(" ");
            Arrays.stream(words)
                    .filter(word -> !dictionary.contains(word.toLowerCase()))
                    .forEach(erroneous::add);
        }
        erroneous.forEach(System.out::println);
    }
}