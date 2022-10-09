package Exams.Real;

import java.util.Scanner;

public class HairSalon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int purpose = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sales = 0.00;

        while (!input.equals("closed")) {
            String text = scanner.nextLine();
            switch (text) {
                case "mens":
                    sales += 15;
                    break;
                case "ladies":
                case "touch up":
                    sales += 20;
                    break;
                case "kids":
                    sales += 10;
                    break;
                case "full color":
                    sales += 30;
                    break;
            }
            if (sales >= purpose) {
                System.out.println("You have reached your target for the day!");
                break;
            }
            input = scanner.nextLine();
        }
        if (sales < purpose) {
            System.out.printf("Target not reached! You need %.0flv. more.%n", purpose - sales);
        }
        System.out.printf("Earned money: %.0flv.", sales);
    }
}
