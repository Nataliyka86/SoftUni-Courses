package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isBalanced = false;
        int counter = 0;


        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            switch (current) {
                case '{':
                case '[':
                case '(':
                    stack.push(current);
                    break;
                case '}':
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '{') {
                            stack.pop();
                            isBalanced = true;
                        } else {
                            isBalanced = false;
                            counter++;
                            break;
                        }
                    }
                    else {
                        isBalanced = false;
                        break;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '[') {
                            stack.pop();
                            isBalanced = true;
                        } else {
                            isBalanced = false;
                            counter++;
                            break;
                        }
                    }
                    else {
                        isBalanced = false;
                        break;
                    }
                    break;
                case ')':
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '(') {
                            stack.pop();
                            isBalanced = true;
                        } else {
                            isBalanced = false;
                            counter++;
                            break;
                        }
                    } else {
                        isBalanced = false;
                        break;
                    }
                    break;
            }
            if (counter > 0) {
                break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
