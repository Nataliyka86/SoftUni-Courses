package Arrays.Exercises;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];
            if (i % 2 == 0) {
                secondArr[i - 1] = firstNumber;
                firstArr[i - 1] = secondNumber;

            } else {
                secondArr[i - 1] = secondNumber;
                firstArr[i - 1] = firstNumber;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));

    }
}
