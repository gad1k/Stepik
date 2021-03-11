package sec_05_integer.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        scanner.close();
        System.out.println(number.charAt(0));
    }
}