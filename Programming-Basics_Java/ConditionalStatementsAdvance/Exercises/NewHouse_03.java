package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;
        double price = 0;

        switch (flowers) {
            case "Roses":
                price = countFlowers * priceRoses;
                if (countFlowers > 80) {
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = countFlowers * priceDahlias;
                if (countFlowers > 90) {
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = countFlowers * priceTulips;
                if (countFlowers > 80) {
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = countFlowers * priceNarcissus;
                if (countFlowers < 120) {
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = countFlowers * priceGladiolus;
                if (countFlowers < 80) {
                    price = price + (price * 0.20);
                }
                break;
        }
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, (budget - price));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
        }


    }
}
