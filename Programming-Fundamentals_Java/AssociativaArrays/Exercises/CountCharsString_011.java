package AssociativaArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsString_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll(" ", "");
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (!charMap.containsKey(symbol)) {
                charMap.put(symbol, 1);
            } else {
                int currentValue = charMap.get(symbol);
                charMap.put(symbol, currentValue + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
