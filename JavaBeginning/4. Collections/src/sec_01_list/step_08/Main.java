package sec_01_list.step_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt())
            list.add(scanner.nextInt());
        scanner.close();
        for (int i = list.size() - 1; i >= 0; i--)
            if (i % 2 != 0)
                System.out.print(list.get(i) + " ");
    }
}