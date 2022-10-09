package ConditionalStatements.More.Exercises;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int debit1 = Integer.parseInt(scanner.nextLine());
        int debit2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double volumePipe1 = debit1 * hours;
        double volumePipe2 = debit2 * hours;
        double volumePipes = volumePipe1 + volumePipe2;

        if (volumePipes <= volume) {
            double volumePoolPercent = volumePipes / volume * 100;
            double volumePipe1Percent = volumePipe1 / volumePipes * 100;
            double volumePipe2Percent = volumePipe2 / volumePipes * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",volumePoolPercent,volumePipe1Percent,volumePipe2Percent);

        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, volumePipes - volume);
        }
    }
}
