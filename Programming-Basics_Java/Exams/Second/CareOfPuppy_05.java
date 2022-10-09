package Exams.Second;

import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mealInKg = Integer.parseInt(scanner.nextLine());
        int mealInGr = mealInKg * 1000;
        String input = scanner.nextLine();
        int totalQuantity = 0;

        while (!input.equals("Adopted")) {
            int grPerMeal = Integer.parseInt(input);
            totalQuantity += grPerMeal;
            input = scanner.nextLine();
        }
        if (totalQuantity <= mealInGr) {
            System.out.printf("Food is enough! Leftovers: %d grams.", mealInGr - totalQuantity);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalQuantity - mealInGr);
        }
    }
}
