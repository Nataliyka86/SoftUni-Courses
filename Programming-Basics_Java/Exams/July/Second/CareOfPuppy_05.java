package Exams.July.Second;

import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scanner.nextLine());
        int foodInGr = foodInKg * 1000;
        String input = scanner.nextLine();
        int totalFoodInGr = 0;

        while (!input.equals("Adopted")) {
            int quantityFood = Integer.parseInt(input);
            totalFoodInGr += quantityFood;
            input = scanner.nextLine();
        }
        if (totalFoodInGr <= foodInGr) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGr - totalFoodInGr);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalFoodInGr - foodInGr);
        }
    }
}
