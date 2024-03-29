package Stacks_and_Queues.Lab;

import java.util.*;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split(" ");
        List<String> partsList = Arrays.asList(expressionParts);
        int result = 0;

        Collections.reverse(partsList);

        for (String part : partsList) {
            stack.push(part);
        }
        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());

            switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                default:
                    System.out.println("Unknown operation " + op);
                    return;
            }
            stack.push("" + result);

        }
        System.out.println(stack.peek());
    }
}
