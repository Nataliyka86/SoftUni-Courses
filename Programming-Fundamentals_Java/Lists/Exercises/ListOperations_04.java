package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArr = command.split("\\s+");
            if (command.contains("Add")) {
                numList.add(Integer.parseInt(commandArr[1]));
            } else if (command.contains("Insert")) {
                if (isValidIndex(Integer.parseInt(commandArr[2]), numList)) {
                    numList.add(Integer.parseInt(commandArr[2]), Integer.parseInt(commandArr[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
//                if (Integer.parseInt(commandArr[1]) >=0 && Integer.parseInt(commandArr[1]) <= (numList.size() -1));
                if (isValidIndex(Integer.parseInt(commandArr[1]), numList)) {
                    numList.remove(Integer.parseInt(commandArr[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int countShiftLeft = Integer.parseInt(commandArr[2]);
                for (int i = 1; i <= countShiftLeft; i++) {
                    int firstNum = numList.get(0);
                    numList.remove(0);
                    numList.add(firstNum);
                }
            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(commandArr[2]);
                for (int i = 1; i <= countShiftRight; i++) {
                    int lastNum = numList.get(numList.size() - 1);
                    numList.remove(numList.size() - 1);
                    numList.add(0, lastNum);
                }
            }

            command = scanner.nextLine();
        }
//        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
        for (int number : numList) {
            System.out.print(number + " ");
        }
    }

    public static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
