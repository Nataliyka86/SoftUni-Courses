package ForLoop.Exercises;

import java.util.Scanner;

public class TennisRankList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
//•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        int n = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int countWinner = 0;

        for (int i = 1; i <= n; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points += 2000;
                    countWinner += 1;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        double percentWinner = countWinner * 1.00 / n * 100;
        System.out.printf("Final points: %d%n", points + startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(points * 1.00 / n));
        System.out.printf("%.2f%%", percentWinner);

    }
}
