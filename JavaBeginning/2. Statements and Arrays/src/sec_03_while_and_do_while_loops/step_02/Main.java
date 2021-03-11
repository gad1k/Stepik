package sec_03_while_and_do_while_loops.step_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;
        while (true) {
            number = scanner.nextInt();
            if (number == 0)
                break;
            else
                count++;
        }
        scanner.close();
        System.out.println(count);
    }
}