package Advanced.StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            //"1 {string}" - appends [string] to the end of the text.
            //
            //"2 {count}" - erases the last [count] elements from the text.
            //
            //"3 {index}" - returns the element at position [index] from the text.
            //
            //"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.

            if (command.startsWith("1")) {
                textStack.push(currentText.toString());
                String textToAppend = command.split("\\s+")[1];
                currentText.append(textToAppend);
            } else if (command.startsWith("2")) {
                textStack.push(currentText.toString());
                int count = Integer.parseInt(command.split("\\s+")[1]);
                currentText.delete(currentText.length() - count, currentText.length());
            } else if (command.startsWith("3")) {
                int position = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentText.charAt(position - 1));
            } else if (command.equals("4")) {
                if (!textStack.isEmpty()) {
                    String lastState = textStack.pop();
                    currentText = new StringBuilder(lastState);

                }
            }
        }
    }
}
