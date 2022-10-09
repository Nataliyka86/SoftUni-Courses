package Exams.Real;

import java.util.Scanner;

public class MaidenParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цена на моминското парти - реално число в интервала [1.00 … 10000.00]
        //2.	Брой любовни послания - цяло число в интервала [0… 1000]
        //3.	Брой восъчни рози - цяло число в интервала [0 … 1000]
        //4.	Брой ключодържатели - цяло число в интервала [0 … 1000]
        //5.	Брой карикатури - цяло число в интервала [0 … 1000]
        //6.	Брой късмети изненада - цяло число в интервала [0 … 1000]

        double priceParty = Double.parseDouble(scanner.nextLine());
        int messages = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keys = Integer.parseInt(scanner.nextLine());
        int caricature = Integer.parseInt(scanner.nextLine());
        int lucky = Integer.parseInt(scanner.nextLine());

        double totalSum = messages * 0.60 + roses * 7.20 + keys * 3.60 + caricature * 18.20 + lucky * 22;
        int counts = messages + roses + keys + caricature + lucky;
        if (counts >= 25) {
            totalSum = totalSum - (totalSum * 0.35);
        }
        double hosting = totalSum * 0.10;
        totalSum = totalSum - hosting;
        if (totalSum >= priceParty) {
            System.out.printf("Yes! %.2f lv left.", totalSum - priceParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceParty - totalSum);
        }
    }
}
