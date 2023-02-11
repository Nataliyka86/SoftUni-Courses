package Methods.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        vowelsCount(input);
    }

    public static void vowelsCount(String input) {
        input = input.toLowerCase();
        int count = 0;
        for (char symbol : input.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }

        }
        System.out.println(count);
    }
}
