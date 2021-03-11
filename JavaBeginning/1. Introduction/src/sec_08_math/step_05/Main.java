package sec_08_math.step_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstVector = reader.readLine();
        String secondVector = reader.readLine();
        int a1 = Integer.parseInt(firstVector.split(" ")[0]);
        int a2 = Integer.parseInt(firstVector.split(" ")[1]);
        int b1 = Integer.parseInt(secondVector.split(" ")[0]);
        int b2 = Integer.parseInt(secondVector.split(" ")[1]);
        double ab = a1 * b1 + a2 * b2;
        double a = Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2));
        double b = Math.sqrt(Math.pow(b1, 2) + Math.pow(b2, 2));
        double acos = Math.acos(ab / (a * b));
        System.out.println((int) Math.toDegrees(acos));
    }
}