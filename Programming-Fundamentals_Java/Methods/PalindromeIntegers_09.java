package Methods.Exercises;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (input.compareTo(backward(input)) == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

            input = scanner.nextLine();
        }

    }

    public static String backward(String input) {
        String backward = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            backward += input.charAt(i);
        }
        return backward;
    }
}
