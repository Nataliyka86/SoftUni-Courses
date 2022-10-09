package Exams.First;

import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        //2.	Размерът на сета - текст с възможности: "small" или "big"
        //3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int countSets = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56 * countSets;
                } else {
                    price = 5 * 28.70 * countSets;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66 * countSets;
                } else {
                    price = 5 * 19.60 * countSets;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.10 * countSets;
                } else {
                    price = 5 * 24.80 * countSets;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20 * countSets;
                } else {
                    price = 5 * 15.20 * countSets;
                }
                break;
        }
        if (price >= 400 && price <= 1000) {
            price = price - (price * 0.15);
        } else if (price > 1000) {
            price = price - (price * 0.50);
        }
        System.out.printf("%.2f lv.", price);

    }
}
