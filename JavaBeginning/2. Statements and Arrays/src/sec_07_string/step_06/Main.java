package sec_07_string.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genome = scanner.next();
        scanner.close();
        double count = 0;
        for (char gc : genome.toUpperCase().toCharArray())
            if (gc == 'G' || gc == 'C')
                count++;
        System.out.println(count / genome.length() * 100);
    }
}