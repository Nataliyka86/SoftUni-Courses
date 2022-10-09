package Exams.Second;

import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        //2.	Размерът на сета - текст с възможности: "small" или "big"
        //3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;


        if (size.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    price = 2 * 56 * count;
                    break;
                case "Mango":
                    price = 2 * 36.66 * count;
                    break;
                case "Pineapple":
                    price = 2 * 42.10 * count;
                    break;
                case "Raspberry":
                    price = 2 * 20 * count;
                    break;
            }
        } else {
            switch (fruit) {
                case "Watermelon":
                    price = 5 * 28.70 * count;
                    break;
                case "Mango":
                    price = 5 * 19.60 * count;
                    break;
                case "Pineapple":
                    price = 5 * 24.80 * count;
                    break;
                case "Raspberry":
                    price = 5 * 15.20 * count;
                    break;
            }
        }
        if (price >= 400 && price <= 1000) {
            price = price - (price * 0.15);
        } else if (price > 1000) {
            price = price * 0.50;
        }
        System.out.printf("%.2f lv.", price);
    }
}
