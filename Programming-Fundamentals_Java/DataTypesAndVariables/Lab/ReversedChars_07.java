package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);
        char thirdLetter = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdLetter, secondLetter, firstLetter);

    }
}
