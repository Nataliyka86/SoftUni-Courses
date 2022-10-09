package Exams.Lab;

import java.util.Scanner;

public class EasterEggsBattle_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count1 = Integer.parseInt(scanner.nextLine());
        int count2 = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();

        while (!winner.equals("End")) {
            if (winner.equals("one")) {
                count2--;
            } else {
                count1--;
            }
            if (count1 == 0 || count2 == 0) {
                break;
            }
            winner = scanner.nextLine();
        }
        if (count1 == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", count2);
        } else if (count2 == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", count1);
        }
        if (winner.equals("End")) {
            System.out.printf("Player one has %d eggs left.%n", count1);
            System.out.printf("Player two has %d eggs left.", count2);
        }
    }
}
