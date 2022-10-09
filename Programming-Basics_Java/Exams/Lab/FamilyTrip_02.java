package Exams.Lab;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        //•	Брой нощувки – цяло число в интервала [0 … 1000]
        //•	Цена за нощувка – реално число в интервала [1.00 … 500.00]
        //•	Процент за допълнителни разходи – цяло число в интервала [0 … 100]

        double budget = Double.parseDouble(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());
        double priceDay = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        if (countDays > 7) {
            priceDay = priceDay - (priceDay * 0.05);
        }
        double totalSum = priceDay * countDays;
        double expenses = budget * percent / 100;
        totalSum = totalSum + expenses;
        if (totalSum <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalSum);
        } else {
            System.out.printf("%.2f leva needed.", totalSum - budget);
        }
    }
}
