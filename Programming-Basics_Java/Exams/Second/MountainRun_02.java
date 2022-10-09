package Exams.Second;

import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3.	Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]

        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double timeGeorge = distanceInMeters * timeInSec;
        double delay = (Math.floor(distanceInMeters / 50)) * 30;
        double totalTime = timeGeorge + delay;
        if (totalTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - record);
        }
    }
}
