package sec_05_integer.step_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int way = a;
        int days = 1;
        while (way < h) {
            way += a - b;
            days++;
        }
        System.out.println(days);
    }
}