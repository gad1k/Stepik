package sec_02_queue_and_stack.step_07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String symbol, inputLine = scanner.nextLine();
        scanner.close();
        String[] brackets = inputLine.split("");
        for (String bracket : brackets) {
            if (bracket.equals("[") || bracket.equals("(") || bracket.equals("{"))
                stack.push(bracket);
            else {
                symbol = stack.peek();
                if (symbol == null || !(
                        (bracket.equals("]") && symbol.equals("[")) ||
                        (bracket.equals(")") && symbol.equals("(")) ||
                        (bracket.equals("}") && symbol.equals("{")))) {
                    System.out.println("false");
                    return;
                } else
                    stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("false");
            return;
        }
        System.out.println("true");
    }
}