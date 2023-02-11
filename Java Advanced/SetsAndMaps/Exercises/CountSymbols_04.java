package Advanced.SetAndMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> inputMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character symbol = input.charAt(i);
            if (!inputMap.containsKey(symbol)) {
                inputMap.put(symbol, 1);
            } else {
                inputMap.put(symbol, inputMap.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : inputMap.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
