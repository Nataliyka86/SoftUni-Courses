package FirstStepsInCoding.Exercises.More;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        double priceVegetable = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int totalKgVegetable = Integer.parseInt(scanner.nextLine());
        int totalKgFruit = Integer.parseInt(scanner.nextLine());

        double priceInLv = priceVegetable * totalKgVegetable + priceFruit * totalKgFruit;
        double priceInEur = priceInLv / 1.94;

        System.out.printf("%.2f", priceInEur);


    }
}
