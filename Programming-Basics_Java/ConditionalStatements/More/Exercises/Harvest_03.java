package ConditionalStatements.More.Exercises;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineSquare = Integer.parseInt(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        int wineLiters = Integer.parseInt(scanner.nextLine());
        int workmen = Integer.parseInt(scanner.nextLine());

        double totalGrapes = vineSquare * grapes;
        double wine = totalGrapes * 0.40 / 2.50;
         if (wine<wineLiters) {

             System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineLiters - wine));
         } else {
             System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(wine));
             System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wine - wineLiters),Math.ceil((wine-wineLiters)/workmen));
         }
    }
}
