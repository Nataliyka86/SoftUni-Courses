package Exams.First;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOther = 0;
        double points = 0.00;

        for (int i = 1; i <= n; i++) {
            String colour = scanner.nextLine();
            switch (colour) {
                case "red":
                    countRed++;
                    points += 5;
                    break;
                case "orange":
                    countOrange++;
                    points += 10;
                    break;
                case "yellow":
                    countYellow++;
                    points += 15;
                    break;
                case "white":
                    countWhite++;
                    points += 20;
                    break;
                case "black":
                    countBlack++;
                    points = Math.floor(points / 2.00);
                    break;
                default:
                    countOther++;
                    break;
            }
        }
        int totalCount = countBlack + countOrange + countOther + countWhite + countYellow + countRed;
        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", countRed);
        System.out.printf("Orange balls: %d%n", countOrange);
        System.out.printf("Yellow balls: %d%n", countYellow);
        System.out.printf("White balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", countOther);
        System.out.printf("Divides from black balls: %d%n", countBlack);

    }
}
