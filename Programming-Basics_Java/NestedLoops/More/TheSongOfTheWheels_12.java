package NestedLoops.More;

import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int m = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isTrue = false;
        int password = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        isTrue = (i * j + k * l == m) && i < j && k > l;
                        if (isTrue) {
                            counter++;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            if (counter == 4) {
                                password = i * 1000 + j * 100 + k * 10 + l;
                            }
                        }

                    }

                }

            }

        }
        if (counter == 0) {
            System.out.println("No!");
        } else if (counter < 4) {
            System.out.println();
            System.out.println("No!");
        } else {
            System.out.println();
            System.out.printf("Password: %d", password);
        }

    }
}
