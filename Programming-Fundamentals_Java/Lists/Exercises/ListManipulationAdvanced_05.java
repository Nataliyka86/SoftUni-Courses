package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
        String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Contains":
                    if (numList.contains(Integer.parseInt(commandArr[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    List<Integer> evenList = new ArrayList<>();
                    List<Integer> oddList = new ArrayList<>();
                    if (commandArr[1].equals("even")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 == 0) {
                                evenList.add(numList.get(i));
                            }
                        }
                        System.out.println(evenList.toString().replaceAll("[\\[\\],]", ""));
                    } else {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 != 0) {
                                oddList.add(numList.get(i));
                            }
                        }
                        System.out.println(oddList.toString().replaceAll("[\\[\\],]", ""));

                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numList.size(); i++) {
                        sum += numList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandArr[1];
                    int number = Integer.parseInt(commandArr[2]);
                    for (int i = 0; i < numList.size(); i++) {
                        List<Integer> newList = new ArrayList<>();
                        switch (condition) {
                            case "<":
                                if (numList.get(i) < number) {
                                    newList.add(numList.get(i));
                                }
                                break;
                            case ">":
                                if (numList.get(i) > number) {
                                    newList.add(numList.get(i));
                                }
                                break;
                            case ">=":
                                if (numList.get(i) >= number) {
                                    newList.add(numList.get(i));
                                }
                                break;
                            case "<=":
                                if (numList.get(i) <= number) {
                                    newList.add(numList.get(i));
                                }
                                break;
                        }
                    }
                    System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));

                    break;
            }

            command = scanner.nextLine();
        }
    }
}
