package Stacks_and_Queues.Lab;

import java.util.*;

public class SimpleCalculator_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        ArrayDeque<String> sumStack = new ArrayDeque<>();
        Collections.addAll(sumStack, inputArr);
        int sum = Integer.parseInt(sumStack.pop());
        while (sumStack.size() > 1) {
            String operator = sumStack.pop();
            int number = Integer.parseInt(sumStack.pop());
            if (operator.equals("+")) {
                sum += number;
            } else {
                sum -= number;
            }
        }
        System.out.println(sum);
    }
}
