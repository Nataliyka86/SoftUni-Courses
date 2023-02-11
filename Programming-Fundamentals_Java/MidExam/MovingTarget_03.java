package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Shoot":
                    int index = Integer.parseInt(commandArr[1]);
                    int power = Integer.parseInt(commandArr[2]);
                    if (isValid(index, targetList)) {
                        if (targetList.get(index) - power > 0) {
                            targetList.set(index, targetList.get(index) - power);
                        } else {
                            targetList.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int index2 = Integer.parseInt(commandArr[1]);
                    int value = Integer.parseInt(commandArr[2]);
                    if (isValid(index2, targetList)) {
                        targetList.add(index2, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int index3 = Integer.parseInt(commandArr[1]);
                    int radius = Integer.parseInt(commandArr[2]);
                    int startIndex = index3 - radius;
                    int endIndex = index3 + radius;
                    if (isValid(startIndex, targetList) && isValid(endIndex, targetList)) {
                        for (int i = index3 + radius; i >= index3 - radius; i--) {
                            targetList.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < targetList.size() - 1; i++) {
            System.out.print(targetList.get(i) + "|");
        }
        System.out.println(targetList.get(targetList.size() - 1));
    }

    public static boolean isValid(int index, List<Integer> targetList) {
        if (index >= 0 && index <= targetList.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
