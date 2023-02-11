package Methods.Exercises;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isSumOfDigitsDivisibleBy8(i) && isFoundOddDigits(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSumOfDigitsDivisibleBy8(int number) {
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number = number / 10;
        }
//        if (sumDigits % 8 ==0) {
//            return true;
//        }else {
//            return false;
//        }
        return sumDigits % 8 == 0;
    }

    public static boolean isFoundOddDigits(int number) {
        while (number > 0) {
            int lastDigits = number % 10;
            if (lastDigits % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
