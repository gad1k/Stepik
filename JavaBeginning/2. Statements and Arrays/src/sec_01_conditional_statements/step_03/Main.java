package sec_01_conditional_statements.step_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        if (a < b + c && b < a + c && c < a + b)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}