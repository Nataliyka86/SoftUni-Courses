package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
        //•	Брой менюта с риба – цяло число в интервала [0 … 99]
        //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarians = Integer.parseInt(scanner.nextLine());

        double priceChicken = chicken * 10.35;
        double priceFish = fish * 12.40;
        double priceVegetarians = vegetarians * 8.15;

        double totalPriceWithoutDessert = priceChicken + priceFish + priceVegetarians;
        double totalPrice = totalPriceWithoutDessert + (totalPriceWithoutDessert * 20/100) + 2.50;

        System.out.println(totalPrice);



    }
}
