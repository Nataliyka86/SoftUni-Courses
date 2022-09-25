package BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hour * 60) + minutes + 30;
        int newHour = allMinutes / 60;
        int newMinutes = allMinutes % 60;

        if (newHour > 23) {
            newHour = 0;
        }
        System.out.printf("%d:%02d", newHour, newMinutes);


    }
}
