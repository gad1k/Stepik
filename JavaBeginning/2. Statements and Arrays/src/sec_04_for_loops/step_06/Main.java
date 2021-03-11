package sec_04_for_loops.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int cnt = 0, sum = 0;
        for (int i = a; i <= b; i++)
            if (i % 3 == 0) {
                sum += i;
                cnt++;
            }
        System.out.println((double) sum / cnt);
    }
}