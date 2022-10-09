package Methods.Exercises;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, secondSymbol);
    }

    public static void printCharactersInRange(char firstSymbol, char secondSymbol) {
        if (firstSymbol < secondSymbol) {
            for (char i = (char) (firstSymbol + 1); i < secondSymbol; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (secondSymbol + 1); i < firstSymbol; i++) {
                System.out.print(i + " ");
            }

        }
    }


}
