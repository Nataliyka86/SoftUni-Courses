package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.00;

        if (operator.equals("+")) {
            result = n1 + n2;
            System.out.printf("%d + %d = %.0f", n1, n2, result);
            if (result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        } else if (operator.equals("-")) {
            result = n1 - n2;
            System.out.printf("%d - %d = %.0f", n1, n2, result);
            if (result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        } else if (operator.equals("*")) {
            result = n1 * n2;
            System.out.printf("%d * %d = %.0f", n1, n2, result);
            if (result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        } else if (operator.equals("/")) {
            result = n1 * 1.00 / n2;
            if ((n2 == 0) || (n1 == 0)) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d / %d = %.2f", n1, n2, result);
            }}
        else if (operator.equals("%")) {
                if ((n2 == 0) || (n1 == 0)) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                result = n1 % n2;
                System.out.printf("%d %% %d = %.0f", n1, n2, result);
            }}
            }
        }


