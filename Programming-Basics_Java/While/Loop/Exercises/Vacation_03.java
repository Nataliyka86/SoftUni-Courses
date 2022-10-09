package While.Loop.Exercises;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int countSpendDays = 0;
        int alldays = 0;
        boolean saved = false;


        while (countSpendDays < 5) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            switch (action) {
                case "spend":
                    money -= sum;
                    countSpendDays++;
                    alldays++;
                    if (money < 0) {
                        money = 0;
                    }
                    break;
                case "save":
                    money += sum;
                    alldays++;
                    countSpendDays = 0;
                    break;
            }
            if (money >= excursion) {
                saved = true;
                break;
            }
        }
        if (countSpendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", alldays);
        }
        if (saved) {
            System.out.printf("You saved the money for %d days.", alldays);
        }
    }
}
