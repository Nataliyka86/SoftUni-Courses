package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Add":
                    int value = Integer.parseInt(commandArr[1]);
                    numList.add(value);
                    break;
                case "Remove":
                    int valueRemove = Integer.parseInt(commandArr[1]);
                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i) == valueRemove) {
                            numList.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int valueReplace = Integer.parseInt(commandArr[1]);
                    int newValue = Integer.parseInt(commandArr[2]);
                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i) == valueReplace) {
                            numList.set(i, newValue);
                            break;
                        }
                    }

                    break;
                case "Collapse":
                    int valueCollapse = Integer.parseInt(commandArr[1]);
                    for (int i = numList.size() - 1; i >= 0; i--) {
                        if (numList.get(i) < valueCollapse) {
                            numList.remove(i);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int item : numList) {
            System.out.print(item + " ");
        }

    }
}
