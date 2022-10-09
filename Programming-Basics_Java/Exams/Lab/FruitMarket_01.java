package Exams.Lab;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        //2.	Количество на бананите в килограми – реално число в интервала [0.00 … 1 0000.00]
        //3.	Количество на портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        //4.	Количество на малините в килограми – реално число в интервала [0.00 … 10000.00]
        //5.	Количество на ягодите в килограми – реално число в интервала [0.00 … 10000.00]

        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double quantityBanana = Double.parseDouble(scanner.nextLine());
        double quantityOrange = Double.parseDouble(scanner.nextLine());
        double quantityRaspberry = Double.parseDouble(scanner.nextLine());
        double quantityStrawberry = Double.parseDouble(scanner.nextLine());


        double priceRaspberry = priceStrawberry / 2;
        double priceOrange = priceRaspberry - (priceRaspberry * 0.40);
        double priceBanana = priceRaspberry - (priceRaspberry * 0.80);

        double totalSum = priceStrawberry * quantityStrawberry + priceBanana * quantityBanana + priceOrange * quantityOrange + priceRaspberry * quantityRaspberry;
        System.out.printf("%.2f", totalSum);

    }
}
