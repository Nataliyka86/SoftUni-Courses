package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lootList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Loot":
                    for (int i = 1; i < commandArr.length; i++) {
                        if (!lootList.contains(commandArr[i])) {
                            lootList.add(0, commandArr[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandArr[1]);
                    if (index >= 0 && index <= lootList.size() - 1) {
                        String currentLoot = lootList.get(index);
                        lootList.remove(index);
                        lootList.add(currentLoot);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArr[1]);
                    List<String> stolenItems = new ArrayList<>();
                    if (count >= lootList.size()) {
                        for (int j = 0; j < lootList.size(); j++) {
                            stolenItems.add(lootList.get(j));
                        }
                            lootList.removeAll(stolenItems);
                    } else {
                        int firstIndex = lootList.size() - count;
                        for (int j = firstIndex; j < lootList.size(); j++) {
                            stolenItems.add(lootList.get(j));
                        }
                        lootList.removeAll(stolenItems);
                    }
                    System.out.println(String.join(", ", stolenItems));
                    break;
            }
            command = scanner.nextLine();
        }
        int sumLength = 0;
        for (int i = 0; i < lootList.size(); i++) {
            String currentItem = lootList.get(i);
            sumLength += currentItem.length();
        }
        double averageGain = sumLength * 1.00 / lootList.size();
        if (lootList.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        }
    }
}