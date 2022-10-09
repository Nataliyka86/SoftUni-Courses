package Exams.Real;

import java.util.Scanner;

public class SantasHoliday_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – дни за престой – цяло число в интервала [0...365]
        //•	Втори ред –  вид помещение –  "room for one person",  "apartment" или "president apartment"
        //•	Трети ред –  оценка - "positive"  или "negative"

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();
        double totalPrice = 0.00;
        double discount = 0.00;

        int nights = days - 1;
        switch (room) {
            case "room for one person":
                totalPrice = nights * 18.00;
                break;
            case "apartment":
                totalPrice = nights * 25.00;
                if (days < 10) {
                    discount = 0.30;
                } else if (days <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.50;
                }
                break;
            case "president apartment":
                totalPrice = nights * 35.00;
                if (days < 10) {
                    discount = 0.10;
                } else if (days <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.20;
                }
                break;
        }
        totalPrice = totalPrice - (totalPrice * discount);
        if (grade.equals("positive")) {
            totalPrice = totalPrice + (totalPrice * 0.25);
        } else {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
        System.out.printf("%.2f", totalPrice);
    }
}
