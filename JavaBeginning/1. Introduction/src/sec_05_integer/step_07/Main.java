package sec_05_integer.step_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        scanner.close();
        int result = number.chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .sum();
        System.out.println(result);
    }
}