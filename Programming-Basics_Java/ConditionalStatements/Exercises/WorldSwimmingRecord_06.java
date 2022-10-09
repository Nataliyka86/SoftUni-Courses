package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecFor1m = Double.parseDouble(scanner.nextLine());

        double ivanTimeInSec = distanceMeters * timeInSecFor1m;
        double delay = (Math.floor(distanceMeters / 15 )) *12.50;
        double totalTime = ivanTimeInSec + delay;
        double timeToRecord = Math.abs(worldRecord - totalTime);

        if (totalTime<worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",timeToRecord);
        }




    }
}
