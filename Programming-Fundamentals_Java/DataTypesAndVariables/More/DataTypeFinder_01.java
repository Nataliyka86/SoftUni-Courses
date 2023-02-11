package DataTypesAndVariables.More;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (input.contains(".")) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() == 1) {
                char inputChar = input.charAt(0);
                if (inputChar >= 97 && inputChar <= 122 || inputChar >= 65 && inputChar <= 90) {
                    System.out.printf("%s is character type%n", input);
                }
            } else if (input.charAt(0) >= 48 && input.charAt(0) <= 57) {
                System.out.printf("%s is integer type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }


    }


}

