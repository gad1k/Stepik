package sec_02_queue_and_stack.step_04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < count; i++)
            queue.add(scanner.nextInt());
        scanner.close();
        for (int i = 0; i < count; i++)
            System.out.println(queue.pollLast());
    }
}