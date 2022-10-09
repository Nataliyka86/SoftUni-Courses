package Exams.Second;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalMeal = Double.parseDouble(scanner.nextLine());
        int catMeal = 0;
        int dogMeal = 0;
        double biscuits = 0;

        for (int i = 1; i <= days; i++) {
            int quantityDog = Integer.parseInt(scanner.nextLine());
            int quantityCat = Integer.parseInt(scanner.nextLine());
            catMeal += quantityCat;
            dogMeal += quantityDog;
            if (i % 3 == 0 ) {
                biscuits += (quantityCat + quantityDog) * 0.10;
            }
        }
        double allMeal = catMeal + dogMeal;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", allMeal / totalMeal * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", dogMeal / allMeal * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", catMeal / allMeal * 100);
    }
}
