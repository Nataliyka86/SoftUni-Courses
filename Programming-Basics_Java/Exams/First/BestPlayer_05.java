package Exams.First;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String bestPlayer = "";
        int bestScore = 0;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (bestScore < goals) {
                bestScore = goals;
                bestPlayer = name;
            }
            if (goals >= 10) {
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (bestScore >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestScore);
        } else {
            System.out.printf("He has scored %d goals.", bestScore);
        }
    }
}
