package NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int sumOdd = 0;
            int sumEven = 0;
            String current = "" + i;
            for (int j = 0; j < current.length(); j++) {
                int currentDigit = Integer.parseInt("" + current.charAt(j));
                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(current + " ");
            }
        }

    }
}
