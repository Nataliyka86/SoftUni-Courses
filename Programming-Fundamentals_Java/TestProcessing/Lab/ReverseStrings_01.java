package TestProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                char currentChar = input.charAt(i);
                reverse += currentChar;
            }
            System.out.printf("%s = %s%n", input, reverse);
            input = scanner.nextLine();
        }

    }
}
