package sec_05_integer.step_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students, desks = 0;
        for (int i = 0; i < 3; i++) {
            students = scanner.nextInt();
            desks += students % 2 == 0 ? students / 2 : students / 2 + 1;
        }
        scanner.close();
        System.out.println(desks);
    }
}