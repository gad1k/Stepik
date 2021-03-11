package sec_04_for_loops.step_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int grade, a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            grade = scanner.nextInt();
            if (grade == 2)
                a++;
            if (grade == 3)
                b++;
            if (grade == 4)
                c++;
            if (grade == 5)
                d++;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}