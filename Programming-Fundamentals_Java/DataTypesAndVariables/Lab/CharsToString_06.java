package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String first = scanner.nextLine();
//        String second = scanner.nextLine();
//        String third = scanner.nextLine();
//
//        String result = first + second + third;
//        System.out.println(result);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        String result = String.format("%c%c%c", first, second, third);
        System.out.println(result);

    }
}
