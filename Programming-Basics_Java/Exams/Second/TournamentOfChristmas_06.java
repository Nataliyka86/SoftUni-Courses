package Exams.Second;

import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalCost = 0;
        int totalWin = 0;
        int totalLost = 0;

        for (int i = 1; i <= days; i++) {
            String sport = scanner.nextLine();
            double moneyPerDay = 0;
            int countWin = 0;
            int countLost = 0;
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    moneyPerDay += 20;
                    countWin++;
                } else {
                    countLost++;
                }
                sport = scanner.nextLine();
            }
            totalWin += countWin;
            totalLost += countLost;
            if (countWin > countLost) {
                moneyPerDay = moneyPerDay + moneyPerDay * 0.10;
            }
            totalCost += moneyPerDay;
        }
        if (totalWin > totalLost) {
            totalCost = totalCost + totalCost * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalCost);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalCost);
        }
    }
}
