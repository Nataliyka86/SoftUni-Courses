package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] commandArr = command.split(" - ");
            switch (commandArr[0]) {
                case "Collect":
                    if (itemsList.contains(commandArr[1])) {
                        break;
                    } else {
                        itemsList.add(commandArr[1]);
                    }
                    break;
                case "Drop":
                    if (itemsList.contains(commandArr[1])) {
                        itemsList.remove(commandArr[1]);
                    }
                    break;
                case "Combine Items":
                    if (itemsList.contains(commandArr[1].split(":")[0])) {
                        int index = itemsList.indexOf(commandArr[1].split(":")[0]);
                        itemsList.add(index + 1, commandArr[1].split(":")[1]);
                    }
                    break;
                case "Renew":
                    if (itemsList.contains(commandArr[1])) {
                        itemsList.remove(commandArr[1]);
                        itemsList.add(commandArr[1]);
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", itemsList));
    }
}
