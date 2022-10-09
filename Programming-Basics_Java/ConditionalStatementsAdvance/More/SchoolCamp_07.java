package ConditionalStatementsAdvance.More;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Сезонът – текст - “Winter”, “Spring” или “Summer”;
        //2.	Видът на групата – текст - “boys”, “girls” или “mixed”;
        //3.	Брой на учениците – цяло число в интервала [1 … 10000];
        //4.	Брой на нощувките – цяло число в интервала [1 … 100].

        String season = scanner.nextLine();
        String kindOfGroup = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0.00;
        String sport = "";

        switch (season) {
            case "Winter":
                switch (kindOfGroup) {
                    case "boys":
                        price = students * nights * 9.60;
                        sport = "Judo";
                        break;
                    case "girls":
                        price = students * nights * 9.60;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        price = students * nights * 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (kindOfGroup) {
                    case "boys":
                        price = students * nights * 7.20;
                        sport = "Tennis";
                        break;
                    case "girls":
                        price = students * nights * 7.20;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        price = students * nights * 9.50;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (kindOfGroup) {
                    case "boys":
                        price = students * nights * 15;
                        sport = "Football";
                        break;
                    case "girls":
                        price = students * nights * 15;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        price = students * nights * 20;
                        sport = "Swimming";
                        break;
                }
                break;
        }
        if (students >= 50) {
            price = price - (price * 0.50);
        } else if (students >= 20) {
            price = price - (price * 0.15);
        } else if (students >= 10) {
            price = price - (price * 0.05);
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}
