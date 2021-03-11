package sec_08_multi_dimensional_arrays.step_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j || i * 2 + 1 == n || j * 2 + 1 == n || i + j == n - 1)
                    matrix[i][j] = "*";
                else
                    matrix[i][j] = ".";
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }
}