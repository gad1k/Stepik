package sec_04_map.step_07;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int size = scanner.nextInt();
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < size; i++)
            map.put(scanner.nextInt(), scanner.next());
        scanner.close();
        map.entrySet().stream()
                .filter(pair -> pair.getKey() >= start && pair.getKey() <= end)
                .forEach(pair -> System.out.println(pair.getKey() + " " + pair.getValue()));
    }
}