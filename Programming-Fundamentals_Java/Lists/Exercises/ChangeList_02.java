package Lists.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Delete":
//                    for (int i = 0; i < numList.size(); i++) {
//                        if (Integer.parseInt(commandArr[1]) == numList.get(i)) {
//                            numList.remove(numList.get(i));
//                        }
//                    }
                    numList.removeAll(Arrays.asList(Integer.parseInt(commandArr[1])));
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
