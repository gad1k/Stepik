package sec_04_for_loops.step_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element, elements = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < elements; i++) {
            element = scanner.nextInt();
            if (element % 4 == 0 && element > max)
                max = element;
        }
        scanner.close();
        System.out.println(max);
    }
}