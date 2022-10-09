package ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;
        int totalTimeInHour = totalTime / 60;
        int totalTimeInSec = totalTime % 60;

        if (totalTimeInSec<10) {
            System.out.printf("%d:0%d",totalTimeInHour,totalTimeInSec);
        } else {
            System.out.printf("%d:%d",totalTimeInHour,totalTimeInSec);
        }



    }
}
