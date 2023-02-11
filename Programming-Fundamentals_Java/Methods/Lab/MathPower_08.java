package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(givenPower(number, power)));
    }

    public static double givenPower(double number, int power) {
        double result = 1.00;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;

    }
}
