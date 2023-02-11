package TestProcessing.Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

        int toAdd = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int toInsert = 0;
            if (i == 0) {
                int currentNumber = Integer.parseInt(input.charAt(i) + "");
                int result = currentNumber * n + toAdd;
                toAdd = 0;
                sb.insert(0, result);
                break;
            }

            int currentNumber = Integer.parseInt(input.charAt(i) + "");
            int result = currentNumber * n + toAdd;
            toAdd = 0;
            if (result < 10) {
                sb.insert(0, result);
            } else {
                toInsert = result % 10;
                toAdd = result / 10;
                sb.insert(0, toInsert);
            }
        }
        System.out.println(sb);
    }
}