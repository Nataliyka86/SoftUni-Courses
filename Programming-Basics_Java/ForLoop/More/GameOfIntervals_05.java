package ForLoop.More;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double to9 = 0;
        double to19 = 0;
        double to29 = 0;
        double to39 = 0;
        double to50 = 0;
        double invalid = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                points = (points / 2);
                invalid += 1;
            } else if (number <= 9) {
                points += number * 0.20;
                to9 += 1;
            } else if (number <= 19) {
                points += number * 0.30;
                to19 += 1;
            } else if (number <= 29) {
                points += number * 0.40;
                to29 += 1;
            } else if (number <= 39) {
                points += 50;
                to39 += 1;
            } else if (number <= 50) {
                points += 100;
                to50 += 1;
            } else {
                points = (points / 2);
                invalid += 1;
            }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", to9 / n * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", to19 / n * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", to29 / n * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", to39 / n * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", to50 / n * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalid / n * 100);
    }
}
