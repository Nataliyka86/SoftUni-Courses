package MidExam;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isSpecial = false;
        double priceWithoutTaxes = 0.00;
        double taxes = 0.00;
        double totalPrice = 0.00;

        while (!input.equals("regular")) {
            if (input.equals("special")) {
                isSpecial = true;
                break;
            }
            double prices = Double.parseDouble(input);
            if (prices < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            priceWithoutTaxes += prices;

            input = scanner.nextLine();
        }
        taxes = priceWithoutTaxes * 0.20;
        totalPrice = priceWithoutTaxes + taxes;
        if (isSpecial) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}
