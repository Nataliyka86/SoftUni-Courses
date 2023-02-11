package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            if (commandArr[0].equals("Add")) {
                wagonList.add(Integer.parseInt(commandArr[1]));
            } else {
                for (int i = 0; i < wagonList.size(); i++) {
                    if ((Integer.parseInt(commandArr[0]) + wagonList.get(i)) <= maxCapacity) {
                        wagonList.set(i, (Integer.parseInt(commandArr[0]) + wagonList.get(i)));
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int num : wagonList) {
            System.out.print(num + " ");
        }
    }
}
