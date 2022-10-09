package NestedLoops.More;

import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalTax = 0.00;

        for (int i = 1; i <= days; i++) {
            double tax = 0.00;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    tax += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    tax += 1.25;
                } else {
                    tax += 1;
                }
            }
            totalTax += tax;
            System.out.printf("Day: %d - %.2f leva%n", i, tax);
        }
        System.out.printf("Total: %.2f leva", totalTax);
    }
}
