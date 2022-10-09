package ConditionalStatements.More.Exercises;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int daysWork = 365 - daysOff;
        int timeForPlay = daysOff * 127 + daysWork * 63;

        if (timeForPlay > 30000) {
            System.out.println("Tom will run away");
            int moreTime = timeForPlay - 30000;
            double moreHours = Math.floor(moreTime / 60);
            double moreMIn = Math.floor(moreTime % 60);
            System.out.printf("%.0f hours and %.0f minutes more for play",moreHours,moreMIn);
        } else {
            System.out.println("Tom sleeps well");
            int lessTime = 30000 - timeForPlay;
            double lessHours = Math.floor(lessTime / 60);
            double lessMin = Math.floor(lessTime % 60);
            System.out.printf("%.0f hours and %.0f minutes less for play",lessHours,lessMin);
        }


    }
}
