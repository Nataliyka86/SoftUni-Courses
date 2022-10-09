package Exams.may;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първи ред – бюджетът - реално число в интервала [1.00… 100000.00]
        //•	След това поредица от два реда (до получаване на команда "Stop" или при заявка за купуване на продукт, чиято стойност е по-висока от наличния бюджет) :
        //o	Име на продукта – текст
        //o	Цена на продукта – реално число в интервала [1.00… 5000.00]

        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        int counter = 0;
        double totalPrice = 0.00;

        while (!name.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter % 3 == 0) {
                price = price / 2;
            }
            totalPrice += price;
            if (budget < totalPrice) {
                break;
            }
            name = scanner.nextLine();
        }
        if (name.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", counter, totalPrice);
        } else {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", totalPrice - budget);
        }
    }
}
