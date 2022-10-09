package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String mark = scanner.nextLine();
        int nights = days - 1;
        double cost = 0.00;

        switch (room) {
            case "room for one person":
                cost = nights * 18.00;
                break;
            case "apartment":
                if (days < 10) {
                    cost = (nights * 25) - (nights * 25 * 0.30);
                } else if (days <= 15) {
                    cost = (nights * 25) - (nights * 25 * 0.35);
                } else {
                    cost = (nights * 25) - (nights * 25 * 0.50);
                }
                break;
            case "president apartment":
                if (days < 10) {
                    cost = (nights * 35) - (nights * 35 * 0.10);
                } else if (days <= 15) {
                    cost = (nights * 35) - (nights * 35 * 0.15);
                } else {
                    cost = (nights * 35) - (nights * 35 * 0.20);
                }
                break;
        }
        if (mark.equals("positive")) {
            System.out.printf("%.2f", cost + (cost * 0.25));
        } else {
            System.out.printf("%.2f", cost - (cost * 0.10));
        }

    }
}
