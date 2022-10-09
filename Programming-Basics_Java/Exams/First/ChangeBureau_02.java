package Exams.First;

import java.util.Scanner;

public class ChangeBureau_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред – броят биткойни. Цяло число в интервала [0…20]
        //•	На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
        //•	На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double china = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double allBitcoins = bitcoin * 1168;
        double allChina = china * 0.15 * 1.76;
        double allMoneyInLv = allBitcoins + allChina;
        double allMoneysInEuro = allMoneyInLv / 1.95;
        double allMoneyWithCommission = allMoneysInEuro - (allMoneysInEuro * commission / 100);

        System.out.printf("%.2f", allMoneyWithCommission);
    }
}
