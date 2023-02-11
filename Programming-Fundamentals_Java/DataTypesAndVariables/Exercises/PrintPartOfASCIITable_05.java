package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCode = Integer.parseInt(scanner.nextLine());
        int lastCode = Integer.parseInt(scanner.nextLine());

        for (int i = firstCode; i <= lastCode; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
//            System.out.print((char)i + " ");

        }
    }

}