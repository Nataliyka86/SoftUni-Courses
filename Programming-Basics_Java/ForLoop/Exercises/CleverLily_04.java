package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Възрастта на Лили - цяло число в интервала [1...77]
        //•	Цената на пералнята - число в интервала [1.00...10 000.00]
        //•	Единична цена на играчка - цяло число в интервала [0...40]

        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int countToy = 0;
        double money = 0.00;
        int countYearsWithMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += i * 5;
                countYearsWithMoney += 1;
            } else {
                countToy += 1;
            }
        }
        double totalPriceToys = countToy * priceToy;
        double savedMoney = (money + totalPriceToys) - (countYearsWithMoney * 1.00);
        if (savedMoney >= price) {
            System.out.printf("Yes! %.2f", savedMoney - price);
        } else {
            System.out.printf("No! %.2f", price - savedMoney);
        }

    }
}
