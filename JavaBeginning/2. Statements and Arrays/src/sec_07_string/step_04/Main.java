package sec_07_string.step_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        scanner.close();
        String longestWord = "";
        int maxLength = Integer.MIN_VALUE;
        for (String word : words)
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        System.out.println(longestWord);
    }
}