package ConditionalStatementsAdvance.Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0.00;

        switch (town) {
            case "Sofia":
                if (sales < 0) {
                    System.out.println("error");
                } else if (sales >= 0 && sales <= 500) {
                    commission = 0.05;
                } else if (sales <= 1000) {
                    commission = 0.07;
                } else if (sales <= 10000) {
                    commission = 0.08;
                } else if (sales > 10000) {
                    commission = 0.12;
                }
                break;
            case "Varna":
                if (sales < 0) {
                    System.out.println("error");
                } else if (sales >= 0 && sales <= 500) {
                    commission = 0.045;
                } else if (sales <= 1000) {
                    commission = 0.075;
                } else if (sales <= 10000) {
                    commission = 0.10;
                } else if (sales > 10000) {
                    commission = 0.13;
                }
                break;
            case "Plovdiv":
                if (sales < 0) {
                    System.out.println("error");
                } else if (sales >= 0 && sales <= 500) {
                    commission = 0.055;
                } else if (sales <= 1000) {
                    commission = 0.08;
                } else if (sales <= 10000) {
                    commission = 0.12;
                } else if (sales > 10000) {
                    commission = 0.145;
                }
                break;
            default:
                System.out.println("error");
                break;

        }
        if (commission != 0) {
            System.out.printf("%.2f", sales * commission);
        }

    }
}
