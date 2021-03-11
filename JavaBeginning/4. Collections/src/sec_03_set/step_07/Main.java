package sec_03_set.step_07;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        for (int i = 0; i < cnt; i++)
            set.add(scanner.next());
        scanner.close();
        set.forEach(System.out::println);
    }
}