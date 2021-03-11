package sec_06_arrays.step_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
                indexMax = i;
            }
        }
        scanner.close();
        System.out.println(indexMax);
    }
}