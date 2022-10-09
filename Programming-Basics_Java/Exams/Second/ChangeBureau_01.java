package Exams.Second;

import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double ioana = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinInLv = bitcoin * 1168;
        double ioanaInLv = ioana * 0.15 * 1.76;
        double euro = (bitcoinInLv + ioanaInLv) / 1.95;
        double result = euro - (euro * commission / 100);

        System.out.printf("%.2f", result);
    }
}
