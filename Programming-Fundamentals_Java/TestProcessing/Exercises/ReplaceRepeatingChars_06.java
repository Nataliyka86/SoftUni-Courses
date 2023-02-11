package TestProcessing.Exercises;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(text.charAt(0));

        for (char symbol : text.toCharArray()) {
            if (sb.charAt(sb.length() - 1) != symbol) {
                sb.append(symbol);
            }
        }
        System.out.println(sb);
    }
}
