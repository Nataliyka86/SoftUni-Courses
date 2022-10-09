package Exams.Second;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        //•	На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        //•	На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]

        int min = Integer.parseInt(scanner.nextLine());
        int countWalks = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int allMin = countWalks * min;
        int allCalories = allMin * 5;
        double enoughCalories = caloriesPerDay * 0.50;
        if (allCalories >= enoughCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", allCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", allCalories);
        }
    }
}
