package While.Loop.Exercises;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        int countPoorGrades = 0;
        boolean isFinished = false;
        double allGrades = 0;
        int countAllGrades = 0;
        String lastTask = "";

        while (countPoorGrades < poorGrades) {
            String nameTask = scanner.nextLine();
            if (nameTask.equals("Enough")) {
                isFinished = true;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                countPoorGrades++;
            }
            allGrades += grade;
            countAllGrades++;
            lastTask = nameTask;
        }
        if (isFinished) {
            System.out.printf("Average score: %.2f%n", allGrades / countAllGrades);
            System.out.printf("Number of problems: %d%n", countAllGrades);
            System.out.printf("Last problem: %s", lastTask);
        } else {
            System.out.printf("You need a break, %d poor grades.", countPoorGrades);
        }
    }
}
