package DataTypesAndVariables.More;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            long[] newArr = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            if (newArr[0] > newArr[1]) {
                long leftNumber = newArr[0];
                leftNumber = Math.abs(leftNumber);
                int sum = 0;
                while (leftNumber > 0) {
                    long lastDigit = leftNumber % 10;
                    leftNumber = leftNumber / 10;
                    sum += lastDigit;
                }
                System.out.println(sum);
            } else {
                long rightNumber = newArr[1];
                rightNumber = Math.abs(rightNumber);
                int sum = 0;
                while (rightNumber > 0) {
                    long lastDigit = rightNumber % 10;
                    rightNumber = rightNumber / 10;
                    sum += lastDigit;
                }

                System.out.println(sum);
            }
        }
    }
}

