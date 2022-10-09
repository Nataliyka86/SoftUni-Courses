package Exams.July.Second;

import java.util.Scanner;

public class HighJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        int wantedGoal = goal - 30;
        int countNotSuccess = 0;
        int allJumps = 0;
        boolean isFail = false;

        while (wantedGoal <= goal) {
            int height = Integer.parseInt(scanner.nextLine());
            allJumps++;
            if (height > wantedGoal) {
                wantedGoal += 5;
                countNotSuccess = 0;
            } else {
                countNotSuccess++;
            }
            if (countNotSuccess == 3) {
                isFail = true;
                break;
            }
        }
        if (isFail) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", wantedGoal, allJumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", goal, (allJumps));
        }
    }
}
