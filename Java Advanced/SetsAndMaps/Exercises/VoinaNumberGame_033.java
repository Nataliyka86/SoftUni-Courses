package Advanced.SetAndMap;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaNumberGame_033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split("\\s+");
        String[] secondInput = scanner.nextLine().split("\\s+");
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstInput.length; i++) {
            firstSet.add(Integer.parseInt(firstInput[i]));
        }
        for (int i = 0; i < secondInput.length; i++) {
            secondSet.add(Integer.parseInt(secondInput[i]));
        }
        for (int i = 1; i <= 50; i++) {
            if (firstSet.isEmpty() || secondSet.isEmpty()) {
                break;
            }
            int firstCard = firstSet.iterator().next();
            int secondCard = secondSet.iterator().next();
            firstSet.remove(firstCard);
            secondSet.remove(secondCard);
            if (firstCard > secondCard) {
                firstSet.add(firstCard);
                firstSet.add(secondCard);
            } else if (secondCard > firstCard) {
                secondSet.add(firstCard);
                secondSet.add(secondCard);
            }
        }
        if (secondSet.size() > firstSet.size()) {
            System.out.println("Second player win!");
        } else if (firstSet.size() > secondSet.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
