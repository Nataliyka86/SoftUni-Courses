package BasicSyntaxConditionalStatementsandLoops.Exercises;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0.00;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.10 || coins == 0.20 || coins == 0.50 || coins == 1.00 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum >= 2) {
                        System.out.printf("Purchased %s%n", product);
                        sum = sum - 2.00;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":

                    if (sum >= 0.70) {
                        System.out.printf("Purchased %s%n", product);
                        sum = sum - 0.70;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":

                    if (sum >= 1.50) {
                        System.out.printf("Purchased %s%n", product);
                        sum = sum - 1.50;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":

                    if (sum >= 0.80) {
                        System.out.printf("Purchased %s%n", product);
                        sum = sum - 0.80;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":

                    if (sum >= 1.00) {
                        System.out.printf("Purchased %s%n", product);
                        sum = sum - 1.00;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scanner.nextLine();
        }
         System.out.printf("Change: %.2f", sum);
    }
}
