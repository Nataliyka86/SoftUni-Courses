package While.Loop.Exercises;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;
        int allSteps = 0;
        boolean tired = false;


        while (allSteps < 10000 ) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                tired=true;
                continue;
            }
            steps = Integer.parseInt(input);
            allSteps += steps;
            if (tired){
                break;
            }
        }
        if (allSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", (allSteps - 10000));
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - allSteps);

        }
    }
}
