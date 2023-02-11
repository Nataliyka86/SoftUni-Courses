package BitsAndBitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCount_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (a > 0) {
            int last = a % 2;
            if (last == b) {
                counter++;
            }
            a = a / 2;
        }
        System.out.println(counter);
    }
}
