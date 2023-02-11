package Advanced.SetAndMap;

import com.sun.source.tree.IfTree;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> cardMap = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");

            if (!cardMap.containsKey(name)) {
                cardMap.put(name, new ArrayList<>());
                Collections.addAll(cardMap.get(name), cards);
            } else {
                for (String card : cards) {
                    if (!cardMap.get(name).contains(card)) {
                        cardMap.get(name).add(card);
                    }
                }
            }
            for (Map.Entry<String, List<String>> entry : cardMap.entrySet()) {
                int sum = 0;
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String currentCard = cards[i];
                    if (currentCard.startsWith("J")) {
                        int digit = 11;
                        int multiply = endWithChar(currentCard);
                        sum += digit * multiply;
                    } else if (currentCard.startsWith("Q")) {
                        int digit = 12;
                        int multiply = endWithChar(currentCard);
                        sum += digit * multiply;
                    } else if (currentCard.startsWith("K")) {
                        int digit = 12;
                        int multiply = endWithChar(currentCard);
                        sum += digit * multiply;
                    } else if (currentCard.startsWith("A")) {
                        int digit = 13;
                        int multiply = endWithChar(currentCard);
                        sum += digit * multiply;
                    } else {
                        int digit = Integer.parseInt(currentCard.charAt(0) + "");
                        int multiply = endWithChar(currentCard);
                        sum += digit * multiply;
                    }
                }
                System.out.printf("%s: %d%n", entry.getKey(), sum);
            }
            input = scanner.nextLine();
        }
    }


    private static int endWithChar(String currentCard) {
        if (currentCard.endsWith("S")) {
            return 4;
        } else if (currentCard.endsWith("H")) {
            return 3;
        } else if (currentCard.endsWith("D")) {
            return 2;
        } else {
            return 1;
        }
    }
}