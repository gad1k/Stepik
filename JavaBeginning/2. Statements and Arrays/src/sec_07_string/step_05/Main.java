package sec_07_string.step_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        String palindrome = new StringBuilder(word).reverse().toString();
        System.out.println(word.equals(palindrome) ? "yes" : "no");
    }
}