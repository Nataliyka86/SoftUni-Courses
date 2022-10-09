package Exams.Second;

import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
        //•	Пол - символ ('m' за мъж и 'f' за жена)
        //•	Възраст - цяло число в интервала [5…105]
        //•	Спорт - текст (една от възможностите в таблицата)
        //Gym	Boxing	Yoga	Zumba	Dances	Pilates

        double budget = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double cost = 0;

        if (gender.equals("m")) {
            switch (sport) {
                case "Gym":
                    cost = 42;
                    break;
                case "Boxing":
                    cost = 41;
                    break;
                case "Yoga":
                    cost = 45;
                    break;
                case "Zumba":
                    cost = 34;
                    break;
                case "Dances":
                    cost = 51;
                    break;
                case "Pilates":
                    cost = 39;
                    break;
            }
        } else {
            switch (sport) {
                case "Gym":
                    cost = 35;
                    break;
                case "Boxing":
                    cost = 37;
                    break;
                case "Yoga":
                    cost = 42;
                    break;
                case "Zumba":
                    cost = 31;
                    break;
                case "Dances":
                    cost = 53;
                    break;
                case "Pilates":
                    cost = 37;
                    break;
            }
        }
        if (ages <= 19) {
            cost = cost - (cost * 0.20);
        }
        if (cost <= budget) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", cost - budget);
        }
    }
}
