package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double sumVideo = videoCount * 250.00;
        double sumProcessor = (sumVideo * 0.35) * processorCount;
        double sumRam = (sumVideo * 0.10) * ramCount;
        double totalSum = sumProcessor + sumRam + sumVideo;

        if (videoCount > processorCount) {
            totalSum = totalSum - (totalSum*0.15);
        }
        if (budget>= totalSum) {
            System.out.printf("You have %.2f leva left!",budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalSum - budget);
        }


    }
}
