package sec_02_queue_and_stack.step_02;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(0);
        queue.add(1);
        queue.add(7);
        System.out.println(queue);
    }
}