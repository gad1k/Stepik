package sec_02_switch_statements.step_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, r, p;
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.println(Math.pow(r, 2) * 3.14);
                break;
        }
        scanner.close();
    }
}