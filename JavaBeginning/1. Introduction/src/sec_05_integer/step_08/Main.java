package sec_05_integer.step_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.next());
        scanner.close();
        System.out.println(sb.reverse());
    }
}