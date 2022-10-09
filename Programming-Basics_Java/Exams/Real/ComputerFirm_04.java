package Exams.Real;

import java.util.Scanner;

public class ComputerFirm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int countSales = 0;
        double rating = 0.00;
        double totalRating = 0.00;
        double totalSales = 0.00;


        for (int i = 1; i <= count; i++) {
            int sales = Integer.parseInt(scanner.nextLine());
            rating = sales % 10;
            countSales = sales / 10;
            totalRating += rating;
            if (rating == 2) {
                totalSales += 0;
            } else if (rating == 3) {
                totalSales += countSales * 0.50;
            } else if (rating == 4) {
                totalSales += countSales * 0.70;
            } else if (rating == 5) {
                totalSales += countSales * 0.85;
            } else if (rating == 6) {
                totalSales += countSales;
            }
        }
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", totalRating / count);
    }
}
