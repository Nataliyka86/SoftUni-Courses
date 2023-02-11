package BasicSyntaxConditionalStatementsandLoops.Exercises;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0.00;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    sum = number * 8.45;
                } else if (day.equals("Saturday")) {
                    sum = number * 9.80;
                } else if (day.equals("Sunday")) {
                    sum = number * 10.46;
                }
                if (number >= 30) {
                    sum = sum - (sum * 0.15);
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    if (number >= 100) {
                        sum = (number - 10) * 10.90;
                    } else {
                        sum = number * 10.90;
                    }
                } else if (day.equals("Saturday")) {
                    if (number >= 100) {
                        sum = (number - 10) * 15.60;
                    } else {
                        sum = number * 15.60;
                    }
                } else if (day.equals("Sunday")) {
                    if (number >= 100) {
                        sum = (number - 10) * 16.00;
                    } else {

                        sum = number * 16.00;
                    }
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    sum = number * 15.00;
                } else if (day.equals("Saturday")) {
                    sum = number * 20.00;
                } else if (day.equals("Sunday")) {
                    sum = number * 22.50;
                }
                if (number >= 10 && number <= 20) {
                    sum = sum - (sum * 0.05);
                }
                break;
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
