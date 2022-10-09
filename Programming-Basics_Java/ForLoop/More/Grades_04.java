package ForLoop.More;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        //•	За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]

        int n = Integer.parseInt(scanner.nextLine());
        double under3 = 0.00;
        double under4 = 0.00;
        double under5 = 0.00;
        double under6 = 0.00;
        double allGrades = 0.00;

        for (int i = 1; i <= n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            allGrades += grade;
            if (grade <= 2.99) {
                under3 += 1;
            } else if (grade <= 3.99) {
                under4 += 1;
            } else if (grade <= 4.99) {
                under5 += 1;
            } else {
                under6 += 1;
            }
        }
        System.out.printf("Top students: %.2f%%%n", under6 / n * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", under5 / n * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", under4 / n * 100);
        System.out.printf("Fail: %.2f%%%n", under3 / n * 100);
        System.out.printf("Average: %.2f", allGrades / n);


    }
}
