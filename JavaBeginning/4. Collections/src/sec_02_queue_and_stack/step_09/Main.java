package sec_02_queue_and_stack.step_09;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxValues = new ArrayDeque<>();
        String action;
        int steps = scanner.nextInt();
        int cur, max = Integer.MIN_VALUE;
        for (int i = 0; i < steps; i++) {
            action = scanner.next();
            switch (action) {
                case "push":
                    cur = scanner.nextInt();
                    stack.push(cur);
                    if (cur > max)
                        max = cur;
                    maxValues.push(max);
                    break;
                case "pop":
                    stack.pop();
                    maxValues.pop();
                    max = maxValues.peek();
                    break;
                case "max":
                    System.out.println(maxValues.peek());
                    break;
            }
        }
        scanner.close();
    }
}