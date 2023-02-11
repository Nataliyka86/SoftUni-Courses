package Exam;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] commandArr = command.split(":\\|:");
            switch (commandArr[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandArr[1]);
                    StringBuilder sb = new StringBuilder(input);
                    sb.insert(index, " ");
                    input = sb.toString();
                    System.out.println(input);
                    break;
                case "Reverse":
                    String substring = commandArr[1];
                    if (input.contains(substring)) {
                        input = input.replaceFirst(substring, "");
                        StringBuilder reverseSb = new StringBuilder(substring);
                        String reverseWord = reverseSb.reverse().toString();
                        input = input.concat(reverseWord);
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substring2 = commandArr[1];
                    String replacement2 = commandArr[2];
                    input = input.replaceAll(substring2, replacement2);
                    System.out.println(input);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", input);
    }
}
