package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class Man_O_War_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] piratesShip = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int[] warShip = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int maximumHealth = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean hasWinner = false;

        while (!command.equals("Retire") && !(hasWinner)) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "Fire":
                    int index = Integer.parseInt(commandArr[1]);
                    int damage = Integer.parseInt(commandArr[2]);
                    if (isValid(index, warShip)) {
                        warShip[index] = warShip[index] - damage;
                        if (warShip[index] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            hasWinner = true;
                            break;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    int damage2 = Integer.parseInt(commandArr[3]);
                    if (isValid(startIndex, piratesShip) && isValid(endIndex, piratesShip)) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            piratesShip[i] = piratesShip[i] - damage2;
                            if (piratesShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                hasWinner = true;
                                break;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int index1 = Integer.parseInt(commandArr[1]);
                    int health = Integer.parseInt(commandArr[2]);
                    if (isValid(index1, piratesShip)) {
                        piratesShip[index1] = piratesShip[index1] + health;
                        if (piratesShip[index1] >= maximumHealth) {
                            piratesShip[index1] = maximumHealth;
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    for (int i = 0; i < piratesShip.length; i++) {
                        if (piratesShip[i] < maximumHealth * 0.20) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }
            command = scanner.nextLine();
        }
        if (!hasWinner) {
            System.out.printf("Pirate ship status: %d%n", sumSections(piratesShip));
            System.out.printf("Warship status: %d", sumSections(warShip));

        }
    }

    public static boolean isValid(int index, int[] ship) {
        if (index >= 0 && index <= ship.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumSections(int[] ship) {
        int sum = 0;
        for (int i = 0; i < ship.length; i++) {
            sum += ship[i];
        }
        return sum;
    }
}
