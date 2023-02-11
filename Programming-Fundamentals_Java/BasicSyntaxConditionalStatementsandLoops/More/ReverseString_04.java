package BasicSyntaxConditionalStatementsandLoops.More;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            input += text.charAt(i);

        }
        System.out.println(input);
    }
}
