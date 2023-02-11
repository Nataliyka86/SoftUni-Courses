package MidExam;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int battles = 0;
        boolean notEnoughEnergy = false;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (energy >= distance) {
                energy -= distance;
            } else {
                notEnoughEnergy = true;
                break;
            }
            battles++;
            if (battles % 3 == 0) {
                energy += battles;
            }
            command = scanner.nextLine();
        }
        if (notEnoughEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battles, energy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", battles, energy);
        }
    }
}