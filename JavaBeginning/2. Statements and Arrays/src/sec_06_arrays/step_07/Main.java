package sec_06_arrays.step_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] src = new int[length];
        int[] dst = new int[length];
        for (int i = 0; i < length; i++)
            src[i] = scanner.nextInt();
        scanner.close();
        if (length - 1 >= 0)
            System.arraycopy(src, 0, dst, 1, length - 1);
        dst[0] = src[length - 1];
        for (int i = 0; i < length; i++)
            System.out.print(dst[i] + " ");
    }
}