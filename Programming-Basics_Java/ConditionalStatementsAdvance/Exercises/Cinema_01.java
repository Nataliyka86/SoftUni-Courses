package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        int countPlaces = row * column;
        double income = 0;

        switch (projection) {
            case "Premiere":
                income = countPlaces * 12.00;
                break;
            case "Normal":
                income= countPlaces * 7.50;
                break;
            case "Discount":
                income = countPlaces * 5.00;
                break;
        }
        System.out.printf("%.2f leva",income);

    }
}
