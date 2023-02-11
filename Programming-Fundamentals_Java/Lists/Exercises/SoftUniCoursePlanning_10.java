package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandArr = command.split(":");
            switch (commandArr[0]) {
                case "Add":
                    if (!inputList.contains(commandArr[1])) {
                        inputList.add(commandArr[1]);
                    }
                    break;
                case "Insert":
                    if (!inputList.contains(commandArr[1])) {
                        inputList.add(Integer.parseInt(commandArr[2]), commandArr[1]);
                    }
                    break;
                case "Remove":
                    if (inputList.contains(commandArr[1])) {
                        inputList.remove(commandArr[1]);
                        if (inputList.contains(commandArr[1] + "-Exercise")) {
                            inputList.remove(commandArr[1] + "-Exercise");
                        }
                    }
                    break;
                case "Swap":
                    if (inputList.contains(commandArr[1]) && inputList.contains(commandArr[2])) {
                        int elementIndex1 = inputList.indexOf(commandArr[1]);
                        int elementIndex2 = inputList.indexOf(commandArr[2]);
                        inputList.set(elementIndex1, commandArr[2]);
                        inputList.set(elementIndex2, commandArr[1]);
                        if (inputList.contains(commandArr[1] + "-Exercise")) {
                            inputList.remove(commandArr[1] + "-Exercise");
                            inputList.add(elementIndex1 + 1, commandArr[1] + "-Exercise");
                        }
                        if (inputList.contains(commandArr[2] + "-Exercise")) {
                            inputList.remove(commandArr[2] + "-Exercise");
                            inputList.add(elementIndex1 + 1, commandArr[2] + "-Exercise");
                        }

                    }
                    break;
                case "Exercise":
                    if (!inputList.contains(commandArr[1])) {
                        inputList.add(commandArr[1]);
                        inputList.add(commandArr[1] + "-Exercise");
                    } else if (inputList.contains(commandArr[1]) && !inputList.contains(commandArr[1] + "-Exercise")) {
                        int index = inputList.indexOf(commandArr[1]);
                        inputList.add(index + 1, commandArr[1] + "-Exercise");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < inputList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, inputList.get(i));
        }
    }
}
