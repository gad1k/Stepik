package sec_01_conditional_statements.step_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        scanner.close();
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}