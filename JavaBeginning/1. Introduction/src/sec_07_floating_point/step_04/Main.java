package sec_07_floating_point.step_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numFloat = scanner.nextFloat();
        scanner.close();
        System.out.println(numFloat - (int) numFloat);
    }
}