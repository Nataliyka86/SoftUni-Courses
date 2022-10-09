package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());
        double priceFish = 0.00;

        if (season.equals("Spring")) {
            priceFish = 3000.00;
        } else if (season.equals("Summer")) {
            priceFish = 4200.00;
        } else if (season.equals("Autumn")) {
            priceFish = 4200.00;
        } else if (season.equals("Winter")) {
            priceFish = 2600.00;
        }
        if (fishmen <= 6) {
            priceFish = priceFish - (priceFish * 0.10);
        } else if ((fishmen > 7) && (fishmen <= 11)) {
            priceFish = priceFish - (priceFish * 0.15);
        } else {
            priceFish = priceFish - (priceFish * 0.25);
        }
        if ((fishmen % 2 == 0) && (!season.equals("Autumn"))) {
            priceFish = priceFish - (priceFish * 0.05);
        }
        if (budget >= priceFish) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - priceFish));
        } else if (budget < priceFish) {
            System.out.printf("Not enough money! You need %.2f leva.", (priceFish - budget));
        }

    }
}
