package sec_08_multi_dimensional_arrays.step_09;

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
        int tickets = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++) {
            int curFreeSeats = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0)
                    curFreeSeats++;
                else if (curFreeSeats >= tickets) {
                    System.out.println(i + 1);
                    return;
                } else
                    curFreeSeats = 0;
            }
            if (curFreeSeats >= tickets) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}