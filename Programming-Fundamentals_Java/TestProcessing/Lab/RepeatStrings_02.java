package TestProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        List<String> repeatList = new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i];
            int length = currentWord.length();
            String repeatWord = repeatString(currentWord, length);
            repeatList.add(repeatWord);
        }
        System.out.println(String.join("", repeatList));
    }

    public static String repeatString(String word, int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += word;
        }
        return result;
    }
}
