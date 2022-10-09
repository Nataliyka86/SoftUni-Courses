package While.Loop.More;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        int countDishes = 0;
        int countPots = 0;
        int countCharge = 0;


        int detergent = bottlesDetergent * 750;

        while (detergent >= 0) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            int vessels = Integer.parseInt(input);
            countCharge++;
            if (countCharge % 3 == 0) {
                countPots += vessels;
                detergent -= vessels * 15;
            } else {
                countDishes += vessels;
                detergent -= vessels * 5;
            }
        }
        if (detergent >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countDishes, countPots);
            System.out.printf("Leftover detergent %d ml.", detergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}
