package sec_07_floating_point.step_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        scanner.close();
        System.out.println(((int) (number * 10)) % 10);
    }
}