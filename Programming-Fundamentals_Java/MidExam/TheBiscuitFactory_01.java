package MidExam;

import java.util.Scanner;

public class TheBiscuitFactory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int competingFactory = Integer.parseInt(scanner.nextLine());

        int biscuitsForDay = biscuitsPerDay * workers;
        double allBiscuits = 0.00;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                double biscuitsThirdDay = Math.floor(biscuitsForDay * 0.75);
                allBiscuits += biscuitsThirdDay;
            } else {
                allBiscuits += biscuitsForDay;
            }
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", allBiscuits);
        if (allBiscuits > competingFactory) {
            double difference = allBiscuits - competingFactory;
            double result = difference / competingFactory * 100;
            System.out.printf("You produce %.2f percent more biscuits.", result);
        }
        if (competingFactory > allBiscuits) {
            double difference = competingFactory - allBiscuits;
            double result = difference / competingFactory * 100;
            System.out.printf("You produce %.2f percent less biscuits.", result);
        }
    }

}

