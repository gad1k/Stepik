package sec_01_conditional_statements.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println("Leap");
                else
                    System.out.println("Regular");
            } else
                System.out.println("Leap");
        } else
            System.out.println("Regular");
    }
}