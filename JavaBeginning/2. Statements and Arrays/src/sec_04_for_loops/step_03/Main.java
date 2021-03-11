package sec_04_for_loops.step_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element, numElements = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numElements; i++) {
            element = scanner.nextInt();
            if (element % 6 == 0)
                sum += element;
        }
        scanner.close();
        System.out.println(sum);
    }
}