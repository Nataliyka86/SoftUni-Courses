package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimal == 0) {
            System.out.println(0);
        } else {
            while (decimal > 0) {
                int currentNum = decimal % 2;
                stack.push(currentNum);
                decimal = decimal / 2;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());

            }
        }

    }
}
