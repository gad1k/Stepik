package sec_04_for_loops.step_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println("Fizz");
            else if (i % 3 != 0 && i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println(i);
        }
    }
}