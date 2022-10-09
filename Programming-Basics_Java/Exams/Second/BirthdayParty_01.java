package Exams.Second;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.20;
        double softs = cake - (cake * 0.45);
        double animator = rent / 3;

        double budget = rent + cake + softs + animator;
        System.out.println(budget);
    }
}
