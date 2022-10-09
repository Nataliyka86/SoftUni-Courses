package NestedLoops.More;

import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundred = Integer.parseInt(scanner.nextLine());
        int ten = Integer.parseInt(scanner.nextLine());
        int one = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= hundred; i++) {
            for (int j = 1; j <= ten; j++) {
                for (int k = 1; k <= one; k++) {
                    boolean isTrue = i % 2 == 0 && k % 2 == 0 && (j <= ten && (j == 2 || j == 3 || j == 5 || j == 7));

                    if (isTrue) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }

                }

            }

        }

    }
}
