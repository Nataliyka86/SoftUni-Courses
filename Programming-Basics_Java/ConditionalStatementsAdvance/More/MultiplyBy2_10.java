package ConditionalStatementsAdvance.More;

import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        while (number >= 0) {
            System.out.printf("Result: %.2f%n", number * 2);

            number = Double.parseDouble(scanner.nextLine());
        }
        if (number < 0) {
            System.out.println("Negative number!");
        }
    }
}
