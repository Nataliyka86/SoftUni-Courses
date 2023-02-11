package AssociativaArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split(" ");
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for (String item : wordArr) {
            for (int i = 0; i < item.length(); i++) {
                char currentChar = (item.charAt(i));
                if (!charMap.containsKey(currentChar)) {
                    charMap.put(currentChar, 1);
                } else {
                    int currentValue = charMap.get(currentChar);
                    charMap.put(currentChar, currentValue + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
