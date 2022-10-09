package NestedLoops.Exercises;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        double totalTickets = 0.00;
        double totalStudents = 0.00;
        double totalStandarts = 0.00;
        double totalKids = 0.00;

        while (!film.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            int students = 0;
            int standart = 0;
            int kids = 0;
            double tickets = 0.00;
            while (tickets < freePlaces) {
                String type = scanner.nextLine();
                if (type.equals("End")) {
                    break;
                }
                switch (type) {
                    case "student":
                        students++;
                        break;
                    case "standard":
                        standart++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                tickets = students + standart + kids;
            }
            System.out.printf("%s - %.2f%% full.%n", film, (tickets / freePlaces * 100));
            totalTickets += tickets;
            totalStandarts += standart;
            totalStudents += students;
            totalKids += kids;
            film = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (totalStudents / totalTickets * 100));
        System.out.printf("%.2f%% standard tickets.%n", (totalStandarts / totalTickets * 100));
        System.out.printf("%.2f%% kids tickets.", (totalKids / totalTickets * 100));

    }
}
