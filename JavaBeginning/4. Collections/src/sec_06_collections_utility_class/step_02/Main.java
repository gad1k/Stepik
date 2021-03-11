package sec_06_collections_utility_class.step_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.asList(scanner.nextLine().split(" "));
        int swaps = scanner.nextInt();
        for (int i = 0; i < swaps; i++)
            Collections.swap(numbers, scanner.nextInt(), scanner.nextInt());
        scanner.close();
        numbers.forEach(num -> System.out.print(num + " "));
    }
}