package ForLoop.More;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalElectricity = 0;
        double totalWater = 0;
        double totalInternet = 0;
        double totalOther = 0;
        double average = 0;

        for (int i = 1; i <= n; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            totalElectricity += electricity;
            totalWater = n * 20;
            totalInternet = n * 15;
            totalOther = (totalElectricity + totalWater + totalInternet) + 0.20 * (totalElectricity + totalWater + totalInternet);
        }
        average = (totalElectricity + totalInternet + totalWater + totalOther) / n;
        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", totalOther);
        System.out.printf("Average: %.2f lv%n", average);
    }
}
