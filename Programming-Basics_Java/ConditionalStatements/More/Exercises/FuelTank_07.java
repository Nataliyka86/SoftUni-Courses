package ConditionalStatements.More.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String lowerStr = fuel.toLowerCase();

        if (litres>=25) {
            if (fuel.equals("Diesel")) {
                System.out.printf("You have enough %s.",lowerStr);
            } else if (fuel.equals("Gasoline")) {
                System.out.printf("You have enough %s.",lowerStr);
            } else if (fuel.equals("Gas")) {
                System.out.printf("You have enough %s.",lowerStr);
            } else {
                System.out.println("Invalid fuel!");
            }
        } else  if (fuel.equals("Diesel")) {
            System.out.printf("Fill your tank with %s!",lowerStr);
        } else if (fuel.equals("Gasoline")) {
            System.out.printf("Fill your tank with %s!",lowerStr);
        } else if (fuel.equals("Gas")) {
            System.out.printf("Fill your tank with %s!",lowerStr);
        } else {
            System.out.println("Invalid fuel!");
        }


    }
}
