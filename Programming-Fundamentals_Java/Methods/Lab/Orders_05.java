package Methods.Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printTotalPrice(input, quantity);
    }

    public static void printTotalPrice(String input, int quantity) {
        double totalPrice = 0;
        switch (input) {
            case "coffee":
                totalPrice = 1.50 * quantity;
                break;
            case "water":
                totalPrice = 1.00 * quantity;
                break;
            case "coke":
                totalPrice = 1.40 * quantity;
                break;
            case "snacks":
                totalPrice = 2.00 * quantity;
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
