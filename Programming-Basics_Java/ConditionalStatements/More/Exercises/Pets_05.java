package ConditionalStatements.More.Exercises;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine());

        double needDogFood = dogFoodPerDay * days;
        double needCatFood = catFoodPerDay * days;
        double needTurtleFood = turtleFoodPerDay * days / 1000;
        double needFood = needCatFood + needTurtleFood + needDogFood;
        if (foodInKg>=needFood) {
            System.out.printf("%.0f kilos of food left.",Math.floor(foodInKg-needFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(needFood-foodInKg));
        }



    }
}
