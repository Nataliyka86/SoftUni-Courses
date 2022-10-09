package NestedLoops.More;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start1 = Integer.parseInt(scanner.nextLine());
        int start2 = Integer.parseInt(scanner.nextLine());
        int distance1 = Integer.parseInt(scanner.nextLine());
        int distance2 = Integer.parseInt(scanner.nextLine());

        int end1 = start1 + distance1;
        int end2 = start2 + distance2;

        for (int i = start1; i <= end1; i++) {
            for (int j = start2; j <= end2; j++) {

                boolean firstSimple = true;
                for (int k = 2; k < i; k++) {
                    if (i % k == 0) {
                        firstSimple = false;
                        break;
                    }
                }
                boolean secondSimple = true;
                for (int l = 2; l < j; l++) {
                    if (j % l == 0) {
                        secondSimple = false;
                        break;
                    }
                }
                if (firstSimple && secondSimple) {
                    System.out.printf("%d%d%n", i, j);
                }

            }

        }

    }

}





