package ConditionalStatements.More.Exercises;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kmCount = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double taxiDay = kmCount * 0.79 + 0.70;
        double taxiNight = kmCount * 0.90 + 0.70;
        double bus = kmCount * 0.09;
        double train = kmCount * 0.06;

        if (kmCount < 20) {
            if (dayOrNight.equals("day")) {
                System.out.printf("%.2f", taxiDay);
            } else {
                System.out.printf("%.2f", taxiNight);
            }
        } else if (kmCount < 100) {
            System.out.printf("%.2f", bus);
        } else {
            System.out.printf("%.2f", train);
        }


    }
}
