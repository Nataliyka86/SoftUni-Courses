package MidExam;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentPerHour1 = Integer.parseInt(scanner.nextLine());
        int studentPerHour2 = Integer.parseInt(scanner.nextLine());
        int studentPerHour3 = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = studentPerHour1 + studentPerHour2 + studentPerHour3;
        int time = 0;
        while (students > 0) {
            time++;
            if (time % 4 == 0) {
                continue;
            }
            students = students - studentsPerHour;
        }
        System.out.printf("Time needed: %dh.", time);
    }
}
