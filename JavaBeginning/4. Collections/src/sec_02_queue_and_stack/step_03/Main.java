package sec_02_queue_and_stack.step_03;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
        queue.add(5);
        queue.pop();
        queue.pop();
        System.out.println(queue);
    }
}