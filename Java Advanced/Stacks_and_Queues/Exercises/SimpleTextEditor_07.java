package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            switch (command.split(" ")[0]) {
                case "1":
                    stack.push(text.toString());
                    String add = command.split(" ")[1];
                    text.append(add);
                    break;
                case "2":
                    stack.push(text.toString());
                    int count = Integer.parseInt(command.split(" ")[1]);
                    String newText = text.substring(0, text.length() - count);
                    text = new StringBuilder(newText);
                    break;
                case "3":
                    int position = Integer.parseInt(command.split(" ")[1]);
                    System.out.println(text.charAt(position - 1));
                    break;
                case "4":
                    if (stack.size() > 0) {
                        text = new StringBuilder(stack.pop());
                    }
                    break;
            }
        }
    }
}
