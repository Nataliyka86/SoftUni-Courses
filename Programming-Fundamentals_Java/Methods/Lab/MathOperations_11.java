package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("##.##");


        System.out.println(df.format(getCalculate(firstNumber, operator, secondNumber)));

    }

    public static double getCalculate(int n1, String operator, int n2) {
        double result = 0;
        switch (operator) {
            case "/":
                result = n1 * 1.00 / n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
        }
        return result;
    }
}
