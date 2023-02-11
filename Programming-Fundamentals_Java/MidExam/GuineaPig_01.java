package MidExam;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());
        double excessFoodGr = foodKg * 1000;
        double excessHayGr = hayKg * 1000;
        double excessCoverGr = coverKg * 1000;
        boolean isNOtEnough = false;

        for (int i = 1; i <= 30; i++) {
            excessFoodGr -= 300;
            if (i % 2 == 0) {
                excessHayGr = excessHayGr - (excessFoodGr * 0.05);
            }
            if (i % 3 == 0) {
                excessCoverGr = excessCoverGr - (weightKg * 1000 / 3);
            }
            if (excessFoodGr <= 0 || excessHayGr <= 0 || excessCoverGr <= 0) {
                isNOtEnough = true;
                break;
            }
        }
        if (isNOtEnough) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", excessFoodGr / 1000, excessHayGr / 1000, excessCoverGr / 1000);
        }
    }
}
