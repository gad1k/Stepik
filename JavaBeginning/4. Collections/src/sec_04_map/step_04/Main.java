package sec_04_map.step_04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        scanner.close();
        String[] words = input.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}