package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String commandLine = scanner.nextLine();

        while (!commandLine.contains("End")) {
            String command = commandLine.split(" ")[0];
            int index = Integer.parseInt(commandLine.split(" ")[1]);
            switch (command) {
                case "Shoot":
                    if (isValidIndex(targetList, index)) {
                        int power = Integer.parseInt(commandLine.split(" ")[2]);
                        if ((targetList.get(index) - power) > 0) {
                            targetList.set(index, targetList.get(index) - power);
                        } else {
                            targetList.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (isValidIndex(targetList, index)) {
                        int value = Integer.parseInt(commandLine.split(" ")[2]);
                        targetList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    int radius = Integer.parseInt(commandLine.split(" ")[2]);
                    int counter = radius * 2 + 1;
                    if ((isValidIndex(targetList, index + radius)) && (isValidIndex(targetList, index - radius))) {
                        while (counter != 0) {
                            targetList.remove(index - radius);
                            counter--;
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        if (!targetList.isEmpty()) {
            for (int i = 0; i < targetList.size() - 1; i++) {
                System.out.print(targetList.get(i) + "|");
            }
            System.out.print(targetList.get(targetList.size() - 1));
        }
    }

    public static boolean isValidIndex(List<Integer> targets, int index) {
        return (index >= 0 && index <= targets.size() - 1);
    }
}
