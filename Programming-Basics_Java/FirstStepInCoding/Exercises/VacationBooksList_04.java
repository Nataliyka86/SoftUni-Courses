package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Брой страници в текущата книга – цяло число в интервала [1…1000]
        //2.	Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //3.	Броят на дните, за които трябва да прочете книгата – цяло число в интервала

        int pagesOfBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalHours = pagesOfBook / pagesPerHour;
        int totalHoursPerDay = totalHours / days;

        System.out.println(totalHoursPerDay);

    }
}
