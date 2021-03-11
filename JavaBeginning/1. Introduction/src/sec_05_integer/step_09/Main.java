package sec_05_integer.step_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] val = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < val.length; i++)
            val[i] = scanner.nextInt();
        scanner.close();
        System.out.println((val[3] - val[0]) * 3600 + (val[4] - val[1]) * 60 + (val[5] - val[2]));
    }
}