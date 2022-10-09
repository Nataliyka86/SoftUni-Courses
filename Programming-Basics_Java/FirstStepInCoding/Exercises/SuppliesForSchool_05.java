package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой пакети химикали - цяло число в интервала [0...100]
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //•	Процент намаление - цяло число в интервала [0...100]

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaningProduct = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        double priceWithoutDiscount = pens * 5.80 + markers * 7.20 + cleaningProduct * 1.20;
        double priceWithDiscount = priceWithoutDiscount - (priceWithoutDiscount * percentDiscount/100);

        System.out.println(priceWithDiscount);


    }
}
