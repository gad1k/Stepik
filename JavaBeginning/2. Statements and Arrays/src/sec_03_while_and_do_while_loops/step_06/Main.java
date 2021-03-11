package sec_03_while_and_do_while_loops.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long res = 1, inc = 1;
        long m = scanner.nextLong();
        scanner.close();
        while (res <= m)
            res *= inc++;
        System.out.println(--inc);
    }
}