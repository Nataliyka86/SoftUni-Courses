package Exams.July.Second;

import java.util.Scanner;

public class BasketballTournament_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournament = scanner.nextLine();
        int allMatches = 0;
        int winMatches = 0;
        int lostMatches = 0;


        while (!tournament.equals("End of tournaments")) {
            int matches = Integer.parseInt(scanner.nextLine());
            allMatches += matches;
            for (int i = 1; i <= matches; i++) {
                int myPoints = Integer.parseInt(scanner.nextLine());
                int otherPoints = Integer.parseInt(scanner.nextLine());
                if (myPoints > otherPoints) {
                    winMatches++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournament, (myPoints - otherPoints));
                } else {
                    lostMatches++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournament, (otherPoints - myPoints));
                }

            }
            tournament = scanner.nextLine();
        }
        double winPercent = winMatches * 1.00 / allMatches * 100;
        double lostPercent = lostMatches * 1.00 / allMatches * 100;
        System.out.printf("%.2f%% matches win%n", winPercent);
        System.out.printf("%.2f%% matches lost", lostPercent);

    }
}
