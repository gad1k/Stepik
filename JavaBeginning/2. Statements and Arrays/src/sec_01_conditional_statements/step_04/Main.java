package sec_01_conditional_statements.step_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if ((num > -15 && num <= 12) || (num > 14 && num < 17) || (num >= 19))
            System.out.print("True");
        else
            System.out.print("False");
    }
}