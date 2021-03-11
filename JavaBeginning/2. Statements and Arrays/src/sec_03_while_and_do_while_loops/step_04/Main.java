package sec_03_while_and_do_while_loops.step_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;
        num = scanner.nextInt();
        while (num != 0) {
            sum += num;
            num = scanner.nextInt();
        }
        scanner.close();
        System.out.println(sum);
    }
}