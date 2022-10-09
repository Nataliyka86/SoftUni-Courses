package Exams.First;

import java.util.Scanner;

public class CatWalking_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        //•	На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        //•	На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]

        int minutesWalkPerDay = Integer.parseInt(scanner.nextLine());
        int walksPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int allMinutesWalks = minutesWalkPerDay * walksPerDay;
        int allCaloriesPerWalks = allMinutesWalks * 5;
        double calories = caloriesPerDay * 0.50;
        if (allCaloriesPerWalks >= calories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", allCaloriesPerWalks);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", allCaloriesPerWalks);
        }
    }
}
