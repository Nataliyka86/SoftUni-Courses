package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow((double) (snowballSnow / snowballTime), snowballQuality);
            if (value > maxValue) {
                maxValue = value;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }


        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);

    }
}
