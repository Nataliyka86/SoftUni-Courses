package Exams.Second;

import java.util.Scanner;

public class SuitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;

        while (capacity > 0) {
            if (input.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }
            double volume = Double.parseDouble(input);
            count++;
            if (count % 3 == 0) {
                volume = volume + volume * 0.10;
            }
            if (volume > capacity) {
                System.out.println("No more space!");
                count -= 1;
                break;
            } else {
                capacity -= volume;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}
