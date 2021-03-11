package sec_04_for_loops.step_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= 1000; i++)
            if (a * Math.pow(i, 3) + b * Math.pow(i, 2) + c * i + d == 0)
                System.out.println(i);
    }
}