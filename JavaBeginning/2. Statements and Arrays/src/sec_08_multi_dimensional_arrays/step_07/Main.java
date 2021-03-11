package sec_08_multi_dimensional_arrays.step_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        scanner.close();
        int tmp;
        for (int k = 0; k < n; k++) {
            tmp = matrix[k][i];
            matrix[k][i] = matrix[k][j];
            matrix[k][j] = tmp;
        }
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++)
                System.out.print(matrix[x][y] + " ");
            System.out.print("\n");
        }
    }
}