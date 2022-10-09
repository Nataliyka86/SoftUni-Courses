package Exams.Lab;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Бюджет на филма – реално число в диапазона [100 000.0… 2 000 000.0]
        //2.	Дестинация – текст, с възможности "Dubai", "Sofia" и "London"
        //3.	Сезон – текст, с възможности "Summer" и "Winter"
        //4.	Брой дни  – цяло число в диапазона [1… 40]

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double totalSum = 0.00;

        if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    totalSum = days * 40000;
                    totalSum = totalSum - (totalSum * 0.30);
                    break;
                case "Sofia":
                    totalSum = days * 12500;
                    totalSum = totalSum + (totalSum * 0.25);
                    break;
                case "London":
                    totalSum = days * 20250;
                    break;
            }
        } else {
            switch (destination) {
                case "Dubai":
                    totalSum = days * 45000;
                    totalSum = totalSum - (totalSum * 0.30);
                    break;
                case "Sofia":
                    totalSum = days * 17000;
                    totalSum = totalSum + (totalSum * 0.25);
                    break;
                case "London":
                    totalSum = days * 24000;
                    break;
            }
        }
        if (totalSum <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalSum - budget);
        }
    }
}

