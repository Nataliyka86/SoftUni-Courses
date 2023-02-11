package MidExam;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int addBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = Double.MIN_VALUE;
        int maxAttendance = 0;

        for (int i = 1; i <= students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double bonus = attendance * 1.00 / lectures * (5 + addBonus);
            if (bonus > maxBonus) {
                maxBonus = bonus;
                maxAttendance = attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
