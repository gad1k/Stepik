package sec_08_multi_dimensional_arrays.step_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] matrix = new int[n][m];
        int x = 0, y = 0;
        int maxValue = Integer.MIN_VALUE;
        String[] array;
        for (int i = 0; i < n; i++) {
            array = scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++)
                matrix[i][j] = Integer.parseInt(array[j]);
        }
        scanner.close();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    x = i;
                    y = j;
                }
        System.out.println(x + " " + y);
    }
}