package Exams.First;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
        //2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
        //3.	Дни до пътуването – цяло число в диапазона [1…60]
        //4.	Брой багажи – цяло число в диапазона [1…10]

        double priceOver20 = Double.parseDouble(scanner.nextLine());
        double kg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countLuggage = Integer.parseInt(scanner.nextLine());
        double priceLuggage = 0;

        if (kg <10) {
            priceLuggage = priceOver20 * 0.20;
        } else if (kg <= 20) {
            priceLuggage = priceOver20 * 0.50;
        } else {
            priceLuggage = priceOver20;
        }
        if (days > 30) {
            priceLuggage = priceLuggage * 0.10 + priceLuggage;
        } else if (days >= 7) {
            priceLuggage = priceLuggage + priceLuggage * 0.15;
        } else {
            priceLuggage = priceLuggage + priceLuggage * 0.40;
        }
        double totalPrice = priceLuggage * countLuggage;
        System.out.printf("The total price of bags is: %.2f lv. ", totalPrice);
    }
}
