package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerial = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double timeLunch = durationBreak / 8.00;
        double timeRelax = durationBreak / 4.00;
        double timeRest = durationBreak - timeLunch - timeRelax;

        if (timeRest >= durationEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial, Math.ceil(timeRest-durationEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerial, Math.ceil(durationEpisode - timeRest));
        }

    }
}
