package sec_06_collections_utility_class.step_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        List<String> lines = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < rows; i++)
            lines.add(scanner.nextLine());
        int distance = scanner.nextInt();
        scanner.close();
        Collections.rotate(lines, distance);
        for (String line : lines)
            System.out.println(line);
    }
}