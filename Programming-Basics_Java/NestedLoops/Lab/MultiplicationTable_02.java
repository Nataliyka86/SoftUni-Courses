package NestedLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.printf("%d * %d = %d%n", i, j, result);
            }
        }
    }
}
