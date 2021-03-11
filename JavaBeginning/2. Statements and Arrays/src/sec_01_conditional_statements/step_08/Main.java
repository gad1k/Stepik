package sec_01_conditional_statements.step_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();
        if (h < a)
            System.out.println("Deficiency");
        else if (h > b)
            System.out.println("Excess");
        else
            System.out.println("Normal");
    }
}