package Exams.may;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double tax = 0.00;
        double totalTax = 0.00;

        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {

                if ((i % 2 == 0) && (j % 2 != 0)) {
                    tax += 2.50;
                } else if ((j % 2 == 0) && (i % 2 != 0)) {
                    tax += 1.25;
                } else {
                    tax += 1.00;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, tax);
            totalTax += tax;
            tax = 0;
        }
        System.out.printf("Total: %.2f leva", totalTax);
    }
}
