package Exams.Lab;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        double totalDogFood = 0.00;
        double totalCatFood = 0.00;
        double totalEatenFood = 0.00;
        double biscuits = 0.00;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            totalDogFood += dogFood;
            totalCatFood += catFood;
            totalEatenFood = totalCatFood + totalDogFood;
            if (i % 3 == 0) {
                biscuits += (dogFood + catFood) * 0.10;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", (totalEatenFood / totalFood *100));
        System.out.printf("%.2f%% eaten from the dog.%n", (totalDogFood / totalEatenFood * 100));
        System.out.printf("%.2f%% eaten from the cat.%n", (totalCatFood / totalEatenFood *100));
    }
}
