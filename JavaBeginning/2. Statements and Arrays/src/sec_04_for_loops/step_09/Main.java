package sec_04_for_loops.step_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parts = scanner.nextInt();
        int part, perfect = 0, larger = 0, smaller = 0;
        for (int i = 0; i < parts; i++) {
            part = scanner.nextInt();
            if (part == 0)
                perfect++;
            if (part == 1)
                larger++;
            if (part == -1)
                smaller++;
        }
        scanner.close();
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}