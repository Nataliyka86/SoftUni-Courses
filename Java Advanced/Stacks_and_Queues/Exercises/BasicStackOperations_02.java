package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int s = Integer.parseInt(input.split(" ")[1]);
        String x = input.split(" ")[2];
        ArrayDeque<String> numStack = new ArrayDeque<>();

        String[] numArr = scanner.nextLine().split("\\s+");

        for (int i = 1; i <= n; i++) {
            numStack.push(numArr[i - 1]);
        }
        for (int i = 1; i <= s; i++) {
            numStack.pop();
        }
        if (numStack.isEmpty()) {
            System.out.println(0);
        } else if (numStack.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(numStack));
        }

    }
}
