package Exam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(@|#)(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        LinkedHashMap<String, String> matcherMap = new LinkedHashMap<>();
        int counter = 0;
        boolean isFound = false;

        while (matcher.find()) {
            isFound = true;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder sb = new StringBuilder(wordTwo);
            String reverse = sb.reverse().toString();
            counter++;
            if (wordOne.equals(reverse)) {
                matcherMap.put(wordOne, wordTwo);
            }
        }
        if (!isFound) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", counter);
        }
        if (matcherMap.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            List<String> matcherList = new ArrayList<>();
            System.out.println("The mirror words are:");
            for (Map.Entry<String, String> entry : matcherMap.entrySet()) {
                String result = entry.getKey() + " <=> " + entry.getValue();
                matcherList.add(result);
            }
            System.out.println(String.join(", ", matcherList));
        }
    }
}
