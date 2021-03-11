package sec_04_map.step_06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] original = scanner.nextLine().split("");
        String[] result = scanner.nextLine().split("");
        String[] encode = scanner.nextLine().split("");
        String[] decode = scanner.nextLine().split("");
        scanner.close();
        Map<String, String> dictO = new HashMap<>();
        Map<String, String> dictR = new HashMap<>();
        for (int i = 0; i < result.length; i++) {
            dictO.put(original[i], result[i]);
            dictR.put(result[i], original[i]);
        }
        Arrays.stream(encode).forEach(k -> System.out.print(dictO.get(k)));
        System.out.println();
        Arrays.stream(decode).forEach(k -> System.out.print(dictR.get(k)));
    }
}