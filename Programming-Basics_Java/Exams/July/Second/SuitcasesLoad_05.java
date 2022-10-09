package Exams.July.Second;

import java.util.Scanner;

public class SuitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunk = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int countSuitcases = 0;
        int i = 1;

        while (!input.equals("End")) {
            double volumeSuitcase = Double.parseDouble(input);
            if (i % 3 == 0) {
                volumeSuitcase = volumeSuitcase + (volumeSuitcase * 0.10);
            }
            if (volumeSuitcase > trunk) {
                System.out.println("No more space!");
                break;
            } else {
                trunk -= volumeSuitcase;
                countSuitcases++;
            }
            input = scanner.nextLine();
            i++;
        }
        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", countSuitcases);
    }
}
