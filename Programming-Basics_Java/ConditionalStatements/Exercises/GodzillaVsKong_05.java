package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double priceClothPer1 = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceAllStatist = statistCount * priceClothPer1;

        if (statistCount>150) {
            priceAllStatist = priceAllStatist - (priceAllStatist*0.10);
        }
        double totalSum = priceAllStatist + decor;
        if (totalSum>budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalSum - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - totalSum);
        }




    }
}
