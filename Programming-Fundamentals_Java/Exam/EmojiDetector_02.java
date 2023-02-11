package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(::|\\*\\*)(?<word>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> emojiList = new ArrayList<>();
        int countEmoji = 0;
        int coolThreshold = 1;
        for (char item : input.toCharArray()) {
            if (Character.isDigit(item)) {
                coolThreshold *= Integer.parseInt(item + "");
            }
        }
        while (matcher.find()) {
            countEmoji++;
            String word = matcher.group("word");
            int totalSum = 0;
            for (int i = 0; i < word.length(); i++) {
                //  char symbol = word.charAt(i);
                int value = (int) word.charAt(i);
                totalSum += value;
            }
            if (totalSum > coolThreshold) {
                emojiList.add(matcher.group());
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", countEmoji);
        for (String item : emojiList) {
            System.out.println(item);
        }
    }
}
