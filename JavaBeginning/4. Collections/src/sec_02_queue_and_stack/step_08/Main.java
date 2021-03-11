package sec_02_queue_and_stack.step_08;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> oneQueue = new ArrayDeque<>();
        Deque<Integer> twoQueue = new ArrayDeque<>();
        int oneLoad = 0, twoLoad = 0;
        int numTasks = scanner.nextInt();
        for (int i = 0; i < numTasks; i++) {
            if (oneLoad <= twoLoad) {
                oneQueue.add(scanner.nextInt());
                oneLoad += scanner.nextInt();
            } else {
                twoQueue.add(scanner.nextInt());
                twoLoad += scanner.nextInt();
            }
        }
        scanner.close();
        oneQueue.forEach((task) -> System.out.print(task + " "));
        System.out.println();
        twoQueue.forEach((task) -> System.out.print(task + " "));
    }
}