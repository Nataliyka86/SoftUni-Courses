package TestProcessing.Exercises;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] textArr = text.toCharArray();

        for (char symbol : textArr) {
            System.out.print((char) (symbol + 3));
        }
    }
}
