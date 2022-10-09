package Exams.Real;

import java.util.Scanner;

public class CatDiet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Процент на мазнините - цяло число в интервала [0…100]
        //•	Процент на протеините - цяло число в интервала [0…100]
        //•	Процент на въглехидратите - цяло число в интервала [0…100]
        //•	Общ брой калории - цяло число в интервала [1000…15000]
        //•	Процент на съдържанието на вода - цяло число в интервала [0…100]

        int percentFat = Integer.parseInt(scanner.nextLine());
        int percentProtein = Integer.parseInt(scanner.nextLine());
        int percentHydrate = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double gramsFat = percentFat / 100.00 * totalCalories / 9;
        double gramsProtein = percentProtein / 100.00 * totalCalories / 4;
        double gramsHydrate = percentHydrate / 100.00 * totalCalories / 4;
        double weight = gramsFat + gramsProtein + gramsHydrate;
        double caloriesPerGrams = totalCalories / weight;
        double totalGrams = (100 - percentWater) * 1.00 / 100 * caloriesPerGrams;

        System.out.printf("%.4f", totalGrams);
    }
}
