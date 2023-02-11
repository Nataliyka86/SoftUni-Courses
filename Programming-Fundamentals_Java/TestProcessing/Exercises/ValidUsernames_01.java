package TestProcessing.Exercises;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernameArr = scanner.nextLine().split(", ");
        for (String item : usernameArr) {
            if (isValid(item)) {
                System.out.println(item);
            }
        }

    }

    public static boolean isValid(String username) {
        boolean isValidLength = false;
        if (username.length() >= 3 && username.length() <= 16) {
            isValidLength = true;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return isValidLength;
    }
}
