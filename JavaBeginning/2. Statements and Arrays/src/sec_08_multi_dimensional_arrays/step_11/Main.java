package sec_08_multi_dimensional_arrays.step_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (!scanner.hasNext("end"))
            input.append(scanner.nextLine()).append(",");
        scanner.close();
        String[] rows = input.toString().split(",");
        int rowSize = rows.length;
        int columnSize = rows[0].split(" ").length;
        int[][] matrix = new int[rowSize][columnSize];
        for (int i = 0; i < matrix.length; i++) {
            String[] tmp = rows[i].split(" ");
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = Integer.parseInt(tmp[j]);
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++)
                System.out.print(
                        matrix[(rowSize + i - 1) % rowSize][j] +
                                matrix[(i + 1) % rowSize][j] +
                                matrix[i][(columnSize + j - 1) % columnSize] +
                                matrix[i][(j + 1) % columnSize] + " ");
            System.out.print("\n");
        }
    }
}