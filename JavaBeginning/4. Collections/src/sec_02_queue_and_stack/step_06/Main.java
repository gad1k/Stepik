package sec_02_queue_and_stack.step_06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();
        int number, count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if ((number = scanner.nextInt()) % 2 == 0)
                queue.addFirst(number);
            else
                queue.addLast(number);
        }
        scanner.close();
        while (!queue.isEmpty())
            System.out.println(queue.pop());
    }
}