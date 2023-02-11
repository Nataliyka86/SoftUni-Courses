package Methods.Exercises;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddle(text);

    }

    public static void printMiddle(String text) {
        if (text.length() % 2 != 0) {
            int index = text.length() / 2;
            System.out.println(text.charAt(index));
        } else {
            int index = text.length() / 2;
            System.out.print(text.charAt(index - 1));
            System.out.println(text.charAt(index));
        }
    }
}
