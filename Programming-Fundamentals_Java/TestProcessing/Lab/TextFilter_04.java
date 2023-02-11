package TestProcessing.Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordArr) {
            int length = banWord.length();
            text = text.replace(banWord, repeatString("*", length));
        }
        System.out.println(text);
    }

    public static String repeatString(String word, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word);
        }
        return sb.toString();
    }
}
