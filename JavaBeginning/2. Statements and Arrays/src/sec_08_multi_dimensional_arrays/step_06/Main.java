package sec_08_multi_dimensional_arrays.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[][] rotateMatrix = new int[m][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                rotateMatrix[j][n - (i + 1)] = matrix[i][j];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(rotateMatrix[i][j] + " ");
            System.out.print("\n");
        }
    }
}