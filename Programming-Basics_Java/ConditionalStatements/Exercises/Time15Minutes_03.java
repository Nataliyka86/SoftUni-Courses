package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Time15Minutes_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());

        int secPlus15 = sec + 15;

        if ( secPlus15 < 60) {
            System.out.printf("%d:%02d", hour,secPlus15);
        } else {
            int newSec = secPlus15 % 60;
            int newHour = hour + secPlus15 / 60;
            if (newHour <=23) {
                System.out.printf("%d:%02d",newHour,newSec);
            } else {
                System.out.printf("0:%02d",newSec);
            }
        }



    }
}
