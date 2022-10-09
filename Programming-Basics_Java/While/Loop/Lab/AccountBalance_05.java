package While.Loop.Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String money = scanner.nextLine();
        double sum = 0;

        while (!money.equals("NoMoreMoney")) {
            double current = Double.parseDouble(money);
            if (current < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", current);
            sum += current;
            money = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
