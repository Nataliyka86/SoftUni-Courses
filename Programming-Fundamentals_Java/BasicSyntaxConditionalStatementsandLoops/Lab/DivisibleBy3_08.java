package BasicSyntaxConditionalStatementsandLoops.Lab;

import java.util.Scanner;

public class DivisibleBy3_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <= 99; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
