package ConditionalStatementsAdvance.More;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
//•	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
//•	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
//•	На четвъртия ред е посочен сезона – [Spring, Summer, Аutumn, Winter]
//•	На петия ред е посочено дали денят е празник – [Y – да / N - не]

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double costChrysanthemums = 0.00;
        double costRoses = 0.00;
        double costTulips = 0.00;

        switch (season) {
            case "Spring":
            case "Summer":
                costChrysanthemums = chrysanthemums * 2.00;
                costRoses = roses * 4.10;
                costTulips = tulips * 2.50;
                break;
            case "Autumn":
            case "Winter":
                costChrysanthemums = chrysanthemums * 3.75;
                costRoses = roses * 4.50;
                costTulips = tulips * 4.15;
                break;
        } double allCost = costChrysanthemums + costRoses + costTulips;
        if (holiday.equals("Y")) {
            allCost = allCost + (allCost * 0.15);
        }
        if (tulips > 7 && season.equals("Spring")) {
            allCost = allCost - (allCost * 0.05);
        } if (roses >=10 && season.equals("Winter")) {
            allCost = allCost - (allCost * 0.10);
        } if ((chrysanthemums + roses + tulips) > 20){
            allCost = allCost - (allCost * 0.20);
        }
        System.out.printf("%.2f", allCost + 2);

    }
}
