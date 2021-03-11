package sec_03_while_and_do_while_loops.step_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1;  i * i <= n; i++)
            System.out.println(i * i);
    }
}