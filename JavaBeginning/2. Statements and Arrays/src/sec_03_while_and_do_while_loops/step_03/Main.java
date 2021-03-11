package sec_03_while_and_do_while_loops.step_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int curNumber, totalNumber;
        totalNumber = scanner.nextInt();
        for (int i = 0; i < totalNumber; i++) {
            curNumber = scanner.nextInt();
            if (curNumber > max && curNumber % 4 == 0)
                max = curNumber;
        }
        scanner.close();
        System.out.println(max);
    }
}