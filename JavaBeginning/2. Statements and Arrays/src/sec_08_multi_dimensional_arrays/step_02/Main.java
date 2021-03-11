package sec_08_multi_dimensional_arrays.step_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        String[] array;
        for (int i = 0; i < n; i++) {
            array = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++)
                matrix[i][j] = Integer.parseInt(array[j]);
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        System.out.println("YES");
    }
}