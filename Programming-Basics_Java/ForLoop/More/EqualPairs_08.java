package ForLoop.More;

import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        boolean isEquals = false;
        int detergent = 0;

        for (int i = 1; i <= n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0) {
                sum1 = number1 + number2;
            } else {
                sum2 = number2 + number1;
            }
            if (sum1 == sum2 || n < 2) {
                isEquals = true;
            } else {
                detergent = Math.abs(sum1 - sum2);
                isEquals = false;
            }
        }
        if (isEquals) {
            System.out.printf("Yes, value=%d", sum1);
        } else {
            System.out.printf("No, maxdiff=%d", detergent);
        }
    }
}
