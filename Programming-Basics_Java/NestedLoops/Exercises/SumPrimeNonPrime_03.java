package NestedLoops.Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumSimple = 0;
        int sumNotSimple = 0;


        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    sumNotSimple += number;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sumSimple += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumSimple);
        System.out.printf("Sum of all non prime numbers is: %d", sumNotSimple);
    }
}
