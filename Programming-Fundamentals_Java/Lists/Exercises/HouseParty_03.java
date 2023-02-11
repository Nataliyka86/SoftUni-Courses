package Lists.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommand = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 1; i <= countCommand; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];
            if (command.contains("not")) {
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            } else {
                if (guestList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestList.add(name);
                }
            }
        }
        for (String item : guestList) {
            System.out.println(item);
        }
    }
}
