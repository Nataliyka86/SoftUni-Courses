package ConditionalStatementsAdvance.More;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classes = "";
        String kindOfCar = "";
        double price = 0.00;


        if (budget <= 100) {
            classes = "Economy class";
            switch (season) {
                case "Summer":
                    kindOfCar = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    kindOfCar = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        } else if (budget <= 500) {
            classes = "Compact class";
            switch (season) {
                case "Summer":
                    kindOfCar = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    kindOfCar = "Jeep";
                    price = budget * 0.80;
                    break;
            }
        } else {
            classes = "Luxury class";
            kindOfCar = "Jeep";
            price = budget * 0.90;
        }
        System.out.println(classes);
        System.out.printf("%s - %.2f", kindOfCar, price);
    }
}
