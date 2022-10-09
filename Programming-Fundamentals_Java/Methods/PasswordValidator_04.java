package Methods.Exercises;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (charactersCount(password) && have2Digits(password) && consistLettersAndDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!charactersCount(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!have2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean charactersCount(String password) {
        return (password.length() >= 6 && password.length() <= 10);
    }

    public static boolean have2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                count++;
            }
        }
        return (count >= 2);
    }

    public static boolean consistLettersAndDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (!((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 65 && password.charAt(i) <= 90) || (password.charAt(i) >= 97 && password.charAt(i) <= 122))) {
                return false;
            }
        }
        return true;
    }
}
