package Methods.Exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        printSmallest(number1, number2, number3);
    }

    public static void printSmallest(int num1, int num2, int num3) {
        int smallNumber = Integer.MAX_VALUE;
        if (num1 < num2) {
            smallNumber = num1;
        } else {
            smallNumber = num2;
        }
        if (num3 < smallNumber) {
            smallNumber = num3;
        }
        System.out.println(smallNumber);

    }
}
