package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double cost = 0.00;
        String destination = "";
        String kindOfRest = "";


        if (budget <= 100) {
            switch (season) {
                case "summer":
                    cost = budget * 0.30;
                    destination = "Bulgaria";
                    kindOfRest = "Camp";
                    break;
                case "winter":
                    cost = budget * 0.70;
                    destination = "Bulgaria";
                    kindOfRest = "Hotel";
                    break;
            }
        } else if (budget <= 1000) {
            switch (season) {
                case "summer":
                    cost = budget * 0.40;
                    destination = "Balkans";
                    kindOfRest = "Camp";
                    break;
                case "winter":
                    cost = budget * 0.80;
                    destination = "Balkans";
                    kindOfRest = "Hotel";
                    break;
            }
        } else if (budget > 1000) {
            cost = budget * 0.90;
            destination = "Europe";
            kindOfRest = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", kindOfRest, cost);
    }
}
