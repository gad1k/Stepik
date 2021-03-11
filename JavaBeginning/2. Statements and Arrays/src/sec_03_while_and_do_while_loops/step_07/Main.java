package sec_03_while_and_do_while_loops.step_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int cnt, value = 1;
        while (true) {
            cnt = value;
            for (int i = 0; i < cnt; i++) {
                System.out.print(value + " ");
                if (--n == 0)
                    return;
            }
            value++;
        }
    }
}