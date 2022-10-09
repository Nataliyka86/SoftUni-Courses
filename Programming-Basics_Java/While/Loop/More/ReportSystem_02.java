package While.Loop.More;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = Integer.parseInt(scanner.nextLine());
        int funds = 0;
        int countPayment = 0;
        int countCash = 0;
        int countCard = 0;
        double fundCash = 0;
        double fundCard = 0;

        while (totalSum > funds) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            int transaction = Integer.parseInt(input);
            countPayment++;
            if (countPayment % 2 == 0) {
                if (transaction < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    funds += transaction;
                    fundCard += transaction;
                    countCard++;
                    System.out.println("Product sold!");
                }
            } else {
                if (transaction > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    funds += transaction;
                    fundCash += transaction;
                    countCash++;
                    System.out.println("Product sold!");
                }
            }
        }
        double averageCash = fundCash / countCash;
        double averageCard = fundCard / countCard;
        if (funds >= totalSum) {
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);

        } else {
            System.out.println("Failed to collect required money for charity.");
        }


    }
}
