package BasicSyntaxConditionalStatementsandLoops.More;

import java.util.Scanner;

public class SortNumbers_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int average = 0;

        for (int i = 1; i <= 3; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            if (max == number && min == number) {
                average = number;
            }
        }

        System.out.println(max);
        System.out.println(average);
        System.out.println(min);
    }
}
