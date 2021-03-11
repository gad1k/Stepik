package sec_01_conditional_statements.step_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        if ((k % n == 0 || k % m == 0) && (n * m > k))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}