package ConditionalStatements.More.Exercises;

import java.util.Scanner;

public class FuelTankPart2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double priceFuel = 0.00;

        if (fuel.equals("Gasoline") && (card.equals("Yes"))) {
            priceFuel = quantityFuel * 2.04;
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                priceFuel = priceFuel - (priceFuel * 0.08);
            } else if (quantityFuel > 25) {
                priceFuel = priceFuel - (priceFuel * 0.10);
            }
            System.out.printf("%.2f lv.", priceFuel);
        } else if (fuel.equals("Gasoline") && (card.equals("No"))) {
            priceFuel = quantityFuel * 2.22;
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                priceFuel = quantityFuel * 2.22;
                priceFuel = priceFuel - (priceFuel * 0.08);
            }
        } else if (quantityFuel > 25) {
            priceFuel = quantityFuel * 2.22;
            priceFuel = priceFuel - (priceFuel * 0.10);
        }

        System.out.printf("%.2f lv.", priceFuel);

      if (fuel.equals("Gas") && (card.equals("Yes"))) {
            priceFuel = quantityFuel * 0.85;
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                priceFuel = priceFuel - (priceFuel * 0.08);
            } else if (quantityFuel > 25) {
                priceFuel = priceFuel - (priceFuel * 0.10);
            }
            System.out.printf("%.2f lv.", priceFuel);
        } else if (fuel.equals("Gas") && (card.equals("No"))) {
            priceFuel = quantityFuel * 0.93;
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                priceFuel = quantityFuel * 0.93;
                priceFuel = priceFuel - (priceFuel * 0.08);
            }
        } else if (quantityFuel > 25) {
            priceFuel = quantityFuel * 0.93;
            priceFuel = priceFuel - (priceFuel * 0.10);
        }

        System.out.printf("%.2f lv.", priceFuel);

     if (fuel.equals("Diesel") && (card.equals("Yes"))) {
            priceFuel = quantityFuel * 2.21;
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                priceFuel = priceFuel - (priceFuel * 0.08);
            } else if (quantityFuel > 25) {
                priceFuel = priceFuel - (priceFuel * 0.10);
            }
            System.out.printf("%.2f lv.", priceFuel);
        } else if (fuel.equals("Diesel") && (card.equals("No"))) {
            priceFuel = quantityFuel * 2.33;
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                priceFuel = quantityFuel * 2.33;
                priceFuel = priceFuel - (priceFuel * 0.08);
            }
        } else if (quantityFuel > 25) {
            priceFuel = quantityFuel * 2.33;
            priceFuel = priceFuel - (priceFuel * 0.10);
        }

        System.out.printf("%.2f lv.", priceFuel);



        }
    }









