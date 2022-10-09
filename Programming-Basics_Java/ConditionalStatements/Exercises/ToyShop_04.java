package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dullCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        int totalCount = puzzleCount + dullCount + bearCount + minionCount + truckCount;

        double totalPrice = puzzleCount * 2.60 + dullCount * 3.00 + bearCount * 4.10 + minionCount * 8.20 + truckCount * 2.00;

        if (totalCount >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.25);}

            double totalMoney = totalPrice - (totalPrice * 0.10);
if (totalMoney >= priceExcursion) {
    System.out.printf("Yes! %.2f lv left.", totalMoney - priceExcursion);
} else {
    System.out.printf("Not enough money! %.2f lv needed.", priceExcursion - totalMoney);
}
        }
    }

