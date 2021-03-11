package sec_07_floating_point.step_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float hour = scanner.nextInt();
        float time = scanner.nextInt();
        scanner.close();
        System.out.println(hour / time);
    }
}