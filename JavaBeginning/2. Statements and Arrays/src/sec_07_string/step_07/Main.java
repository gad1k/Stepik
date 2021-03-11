package sec_07_string.step_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.next();
        scanner.close();
        int count = 1;
        char previousSym = dna.charAt(0);
        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == previousSym)
                count++;
            else {
                System.out.print(String.valueOf(previousSym) + count);
                count = 1;
            }
            previousSym = dna.charAt(i);
        }
        System.out.print(String.valueOf(previousSym) + count);
    }
}