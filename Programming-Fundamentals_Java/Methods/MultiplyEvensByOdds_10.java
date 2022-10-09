package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = getSumEven(number) * getSumOdd(number);
        System.out.println(result);

    }

    public static int getSumEven(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number = number / 10;
        }
        return sum;
    }

    public static int getSumOdd(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                sum += lastDigit;
            }
            number = number / 10;
        }
        return sum;
    }

}
