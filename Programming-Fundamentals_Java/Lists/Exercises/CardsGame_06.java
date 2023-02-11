package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (firstList.size() != 0 && secondList.size() != 0) {
            int firstPlayerCard = firstList.get(0);
            int secondPlayerCard = secondList.get(0);
            firstList.remove(0);
            secondList.remove(0);
            if (firstPlayerCard > secondPlayerCard) {
                firstList.add(firstPlayerCard);
                firstList.add(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard) {
                secondList.add(secondPlayerCard);
                secondList.add(firstPlayerCard);
            }
        }
        if (secondList.size() == 0) {
            for (int i = 0; i < firstList.size(); i++) {
                sum += firstList.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (firstList.size() == 0) {
            for (int i = 0; i < secondList.size(); i++) {
                sum += secondList.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
