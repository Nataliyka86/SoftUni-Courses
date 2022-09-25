package BasicSyntaxConditionalStatementsandLoops.Exercises;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 1;
        int totalSum = 0;

        int divisible = number / 10;
        int remainder = number % 10;
        while (divisible != 0) {
            for (int i = 1; i <= remainder; i++) {
                sum = sum * i;
            }
            totalSum += sum;
            remainder = divisible % 10;
            divisible = divisible / 10;
            sum = 1;
        }
        for (int i = 1; i <= remainder; i++) {
            sum = sum * i;
        }
        totalSum += sum;

        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
