package sec_08_multi_dimensional_arrays.step_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] src = new int[x][y];
        int[][] dst = new int[y][x];
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                src[i][j] = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                dst[j][i] = src[i][j];
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++)
                System.out.print(dst[i][j] + " ");
    }
}