package FirstStepsInCoding.Exercises.More;

import java.util.Scanner;

public class Fishland_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mackerel = Double.parseDouble(scanner.nextLine());
        double toy = Double.parseDouble(scanner.nextLine());
        double bonitoQuantity = Double.parseDouble(scanner.nextLine());
        double horseMackerelQuantity = Double.parseDouble(scanner.nextLine());
        int shellQuantity = Integer.parseInt(scanner.nextLine());

        double priceBonito = mackerel + (mackerel * 60/100);
        double priceHorseMackerel = toy + (toy * 80/100);

        double totalCost = bonitoQuantity * priceBonito + horseMackerelQuantity * priceHorseMackerel + shellQuantity * 7.50;

        System.out.printf("%.2f",totalCost);


    }
}
