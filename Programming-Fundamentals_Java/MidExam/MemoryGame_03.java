package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int moves = 0;

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            int firstIndex = Integer.parseInt(commandArr[0]);
            int secondIndex = Integer.parseInt(commandArr[1]);
            moves++;
            if (firstIndex == secondIndex || firstIndex > (elementsList.size() - 1) || secondIndex > (elementsList.size() - 1) || firstIndex < 0 || secondIndex < 0) {
                String addElement = "-" + moves + "a";
                elementsList.add(elementsList.size() / 2, addElement);
                elementsList.add((elementsList.size() / 2) + 1, addElement);
                System.out.println("Invalid input! Adding additional elements to the board");
                command = scanner.nextLine();
                continue;
            }
            if (elementsList.get(firstIndex).equals(elementsList.get(secondIndex))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", elementsList.get(firstIndex));
                if (secondIndex > firstIndex) {
                    elementsList.remove(secondIndex);
                    elementsList.remove(firstIndex);
                } else {
                    elementsList.remove(firstIndex);
                    elementsList.remove(secondIndex);
                }
            } else {
                System.out.println("Try again!");
            }
            if (elementsList.size() == 0) {
                System.out.printf("You have won in %d turns!", moves);
                break;
            }
            command = scanner.nextLine();
        }
        if (elementsList.size() != 0) {
            System.out.println("Sorry you lose :(");
            for (String item : elementsList) {
                System.out.print(item + " ");
            }
        }

    }
}
