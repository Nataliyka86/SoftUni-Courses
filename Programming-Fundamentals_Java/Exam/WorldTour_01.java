package Exam;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] commandArr = command.split(":");
            if (command.contains("Add")) {
                int index = Integer.parseInt(commandArr[1]);
                String string = commandArr[2];
                if (index >= 0 && index < sb.length()) {
                    sb.insert(index, string);
                }
            } else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);
                if (startIndex >= 0 && startIndex < sb.length() && endIndex >= 0 && endIndex < sb.length()) {
                    sb.delete(startIndex, endIndex + 1);
                }
            } else if (command.contains("Switch")) {
                String oldString = commandArr[1];
                String newString = commandArr[2];
                String text = sb.toString();
                if (text.contains(oldString)) {
                    text = text.replaceAll(oldString, newString);
                    sb = new StringBuilder(text);
                }
            }
            System.out.println(sb);
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", sb);
    }
}
