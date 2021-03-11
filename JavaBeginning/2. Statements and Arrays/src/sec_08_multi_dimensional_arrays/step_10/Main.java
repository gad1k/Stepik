package sec_08_multi_dimensional_arrays.step_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String direction = "RIGHT";
        int[][] matrix = new int[n][n];
        int i = 0, j = 0;
        for (int k = 1; k <= n * n; k++) {
            switch (direction) {
                case "RIGHT":
                    if (j + 1 == n || matrix[i][j + 1] != 0) {
                        direction = "DOWN";
                        matrix[i][j] = k;
                        i++;
                    } else
                        matrix[i][j++] = k;
                    break;
                case "DOWN":
                    if (i + 1 == n || matrix[i + 1][j] != 0) {
                        direction = "LEFT";
                        matrix[i][j] = k;
                        j--;
                    } else
                        matrix[i++][j] = k;
                    break;
                case "LEFT":
                    if (j - 1 < 0 || matrix[i][j - 1] != 0) {
                        direction = "UP";
                        matrix[i][j] = k;
                        i--;
                    } else
                        matrix[i][j--] = k;
                    break;
                case "UP":
                    if (i - 1 == n || matrix[i - 1][j] != 0) {
                        direction = "RIGHT";
                        matrix[i][j] = k;
                        j++;
                    } else
                        matrix[i--][j] = k;
                    break;
            }
        }
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(matrix[x][y] + " ");
            System.out.print("\n");
        }
    }
}