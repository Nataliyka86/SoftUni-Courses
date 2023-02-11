package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceryList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Urgent":
                    if (groceryList.contains(commandArr[1])) {
                        break;
                    } else {
                        groceryList.add(0, commandArr[1]);
                    }
                    break;
                case "Unnecessary":
                    if (groceryList.contains(commandArr[1])) {
                        groceryList.remove(commandArr[1]);
                    }
                    break;
                case "Correct":
                    String oldItem = commandArr[1];
                    String newItem = commandArr[2];
                    if (groceryList.contains(oldItem)) {
                        int index = groceryList.indexOf(oldItem);
                        groceryList.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    if (groceryList.contains(commandArr[1])) {
                        groceryList.remove(commandArr[1]);
                        groceryList.add(commandArr[1]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceryList));
    }
}
