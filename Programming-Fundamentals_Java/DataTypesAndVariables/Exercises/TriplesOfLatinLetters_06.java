package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < (97 + n); i++) {
            for (int j = 97; j < (n + 97); j++) {
                for (int k = 97; k < (n + 97); k++) {
                    char first = (char) i;
                    char second = (char) j;
                    char third = (char) k;

                    System.out.printf("%c%c%c%n", first, second, third);

                }

            }

        }


    }
}

