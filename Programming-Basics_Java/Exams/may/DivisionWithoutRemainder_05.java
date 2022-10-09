package Exams.may;

import java.util.Scanner;

public class DivisionWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double count1 = 0.00;
        double count2 = 0.00;
        double count3 = 0.00;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                count1++;
            }
            if (number % 3 == 0) {
                count2++;
            }
            if (number % 4 == 0) {
                count3++;
            }
        }
        double p1 = count1 / n * 100;
        double p2 = count2 / n * 100;
        double p3 = count3 / n * 100;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%", p3);
    }
}
