package Exams.may;

import java.util.Scanner;

public class Safari_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	Бюджет – реално число в интервала [0.00… 10000.00]
//•	Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
//•	Ден от седмицата – текст с възможности "Saturday" и "Sunday"

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double totalFuel = fuel * 2.10;
        double totalPrice = totalFuel + 100;
        if (day.equals("Saturday")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        } else if (day.equals("Sunday")) {
            totalPrice = totalPrice - (totalPrice * 0.20);
        }
        if (budget >= totalPrice) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalPrice - budget);
        }

    }
}
