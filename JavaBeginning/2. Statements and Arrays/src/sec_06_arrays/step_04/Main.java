package sec_06_arrays.step_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        boolean result = false;
        for (int i = 1; i < length; i++)
            if (array[i - 1] == n && array[i] == m || array[i - 1] == m && array[i] == n) {
                result = true;
                break;
            }
        System.out.println(result);
    }
}