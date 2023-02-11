package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        boolean isDeath = false;

        String[] roomArr = scanner.nextLine().split("\\|");
        for (int i = 0; i < roomArr.length; i++) {
            String currentRoomArr = roomArr[i];
            String command = currentRoomArr.split(" ")[0];
            int number = Integer.parseInt(currentRoomArr.split(" ")[1]);
            if (command.equals("potion")) {
                if (health + number >= 100) {
                    number = 100 - health;
                    health = 100;
                } else {
                    health += number;
                }
                System.out.printf("You healed for %d hp.%n", number);
                System.out.printf("Current health: %s hp.%n", health);
            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d", i + 1);
                    isDeath = true;
                    break;
                }
            }
        }
        if (!isDeath) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }


    }
}
