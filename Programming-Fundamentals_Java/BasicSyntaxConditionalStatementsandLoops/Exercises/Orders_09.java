package BasicSyntaxConditionalStatementsandLoops.Exercises;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double allPrice = 0.00;
        double totalPrice = 0.00;

        for (int i = 1; i <= n; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int count = Integer.parseInt(scanner.nextLine());
            allPrice = days * price * count;
            System.out.printf("The price for the coffee is: $%.2f%n", allPrice);
            totalPrice += allPrice;

        }
        System.out.printf("Total: $%.2f", totalPrice);

    }
}
