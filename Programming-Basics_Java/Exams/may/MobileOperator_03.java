package Exams.may;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Срок на договор – текст – "one", или "two"
        //2.	Тип на договор – текст – "Small",  "Middle", "Large"или "ExtraLarge"
        //3.	Добавен мобилен интернет – текст – "yes" или "no"
        //4.	Брой месеци за плащане - цяло число в интервала [1 … 24]

        String term = scanner.nextLine();
        String type = scanner.nextLine();
        String net = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        if (term.equals("one")) {
            switch (type) {
                case "Small":
                    price = 9.98;
                    break;
                case "Middle":
                    price = 18.99;
                    break;
                case "Large":
                    price = 25.98;
                    break;
                case "ExtraLarge":
                    price = 35.99;
                    break;
            }
        } else {
            switch (type) {
                case "Small":
                    price = 8.58;
                    break;
                case "Middle":
                    price = 17.09;
                    break;
                case "Large":
                    price = 23.59;
                    break;
                case "ExtraLarge":
                    price = 31.79;
                    break;
            }
        }
        if (net.equals("yes")) {
            if (price <= 10) {
                price = price + 5.50;
            } else if (price <= 30) {
                price = price + 4.35;
            } else {
                price = price + 3.85;
            }
        }
        if (term.equals("two")) {
            price = price - (price * 0.0375);
        }
        double totalPrice = price * months;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
