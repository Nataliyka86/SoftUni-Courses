package Exams.First;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());


        int four11 = start % 10;
        int newNumber1 = start / 10;
        int third11 = newNumber1 % 10;
        newNumber1 = newNumber1 / 10;
        int second11 = newNumber1 % 10;
        newNumber1 = newNumber1 / 10;
        int first11 = newNumber1 % 10;

        int four22 = end % 10;
        int newNumber2 = end / 10;
        int third22 = newNumber2 % 10;
        newNumber2 = newNumber2 / 10;
        int second22 = newNumber2 % 10;
        newNumber2 = newNumber2 / 10;
        int first22 = newNumber2 % 10;

        for (int i = first11; i <= first22; i++) {
            for (int j = second11; j <= second22; j++) {
                for (int k = third11; k <= third22; k++) {
                    for (int l = four11; l <= four22; l++) {
                        boolean isTrue = i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0;

                        if (isTrue) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}

