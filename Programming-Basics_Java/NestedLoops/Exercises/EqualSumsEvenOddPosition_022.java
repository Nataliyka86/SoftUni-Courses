package NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int sumOdd = 0;
            int sumEven = 0;
            int currentNumber = i;
            for (int j = 6; j >= 1; j--) {
                int digit = currentNumber % 10;
                if (j % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd+=digit;
                }
                currentNumber = currentNumber /10;

            }

            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
