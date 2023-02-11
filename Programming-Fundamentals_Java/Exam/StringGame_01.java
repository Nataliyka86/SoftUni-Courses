package Exam;

import java.util.Scanner;

public class StringGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commandArr = command.split("\\s+");
            switch (commandArr[0]) {
                case "Change":
                    String charSymbol = commandArr[1];
                    String replacement = commandArr[2];
                    input = input.replaceAll(charSymbol, replacement);
                    System.out.println(input);
                    break;
                case "Includes":
                    String substring = commandArr[1];
                    if (input.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String substring2 = commandArr[1];
//                    int length = substring2.length();
//                    String currentSubstring = input.substring(input.length() - length - 1);
                    if (input.endsWith(substring2)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String charSymbol2 = commandArr[1];
                    int index = input.indexOf(charSymbol2);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int count = Integer.parseInt(commandArr[2]);
                    input = input.substring(startIndex, startIndex + count);
                    System.out.println(input);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
