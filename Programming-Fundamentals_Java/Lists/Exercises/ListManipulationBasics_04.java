package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Add":
                    numList.add(Integer.parseInt(commandArr[1]));
                    break;
                case "Remove":
                    numList.remove(Integer.valueOf(Integer.parseInt(commandArr[1])));
                    break;
                case "RemoveAt":
                    numList.remove(Integer.parseInt(commandArr[1]));
                    break;
                case "Insert":
                    numList.add(Integer.parseInt(commandArr[2]), Integer.parseInt(commandArr[1]));
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
