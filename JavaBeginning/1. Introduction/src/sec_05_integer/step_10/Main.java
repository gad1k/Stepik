package sec_05_integer.step_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 == 0)
            System.out.println(n + 2);
        else
            System.out.println(n + 1);
    }
}