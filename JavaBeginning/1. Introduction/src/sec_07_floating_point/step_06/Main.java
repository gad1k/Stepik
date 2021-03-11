package sec_07_floating_point.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();
        System.out.println(Math.pow(x, 3) + Math.pow(x, 2) + x + 1);
    }
}