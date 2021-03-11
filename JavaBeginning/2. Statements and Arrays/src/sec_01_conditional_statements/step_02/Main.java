package sec_01_conditional_statements.step_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        scanner.close();
    }
}