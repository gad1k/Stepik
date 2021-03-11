package sec_07_string.step_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.next();
        scanner.close();
        int sumOne = 0, sumTwo = 0;
        for (int i = 0; i < ticket.length() / 2; i++) {
            sumOne += Integer.parseInt(String.valueOf(ticket.charAt(i)));
            sumTwo += Integer.parseInt(String.valueOf(ticket.charAt(i + 3)));
        }
        System.out.println(sumOne == sumTwo ? "Lucky" : "Regular");
    }
}