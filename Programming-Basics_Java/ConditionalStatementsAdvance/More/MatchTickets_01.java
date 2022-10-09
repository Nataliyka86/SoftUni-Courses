package ConditionalStatementsAdvance.More;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double moneyLeft = 0.00;
        double ticket = 0.00;

        if (people >= 1 && people <= 4) {
            moneyLeft = budget - (budget * 0.75);
        } else if (people <= 9) {
            moneyLeft = budget - (budget * 0.60);
        } else if (people <= 24) {
            moneyLeft = budget - (budget * 0.50);
        } else if (people <= 49) {
            moneyLeft = budget - (budget * 0.40);
        } else {
            moneyLeft = budget - (budget * 0.25);
        }
        switch (category) {
            case "VIP":
                ticket = people * 499.99;
                break;
            case "Normal":
                ticket = people * 249.99;
                break;
        }
        if (moneyLeft >= ticket) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft - ticket);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ticket - moneyLeft);
        }
    }
}



