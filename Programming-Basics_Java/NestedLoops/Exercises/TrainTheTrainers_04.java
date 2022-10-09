package NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double totalGrades = 0;
        int counter = 0;

        while (!name.equals("Finish")) {
            double allGrades = 0;
            for (int i = 1; i <= n; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                allGrades += grades;
                totalGrades += grades;
                counter++;
            }
            System.out.printf("%s - %.2f.%n", name, allGrades / n);
            name = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrades / counter);
    }
}
