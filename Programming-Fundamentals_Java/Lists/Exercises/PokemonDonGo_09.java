package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDonGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sumRemoved = 0;
        while (numList.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= numList.size() - 1) {
                int removedElement = numList.get(index);
                sumRemoved += removedElement;
                numList.remove(index);
                modifyList(numList, removedElement);

            } else if (index < 0) {
                int firstElement = numList.get(0);
                sumRemoved += firstElement;
                numList.remove(0);
                int lastElement = numList.get(numList.size() - 1);
                numList.add(0, lastElement);
                modifyList(numList, firstElement);
            } else if (index > numList.size() - 1) {
                int lastElement = numList.get(numList.size() - 1);
                sumRemoved += lastElement;
                numList.remove(numList.size() - 1);
                int firstElement = numList.get(0);
                numList.add(firstElement);
                modifyList(numList, lastElement);
            }

        }
        System.out.println(sumRemoved);
    }

    private static void modifyList(List<Integer> numList, int removedElement) {
        for (int i = 0; i < numList.size(); i++) {
            int currentNum = numList.get(i);
            if (currentNum <= removedElement) {
                currentNum += removedElement;
            } else {
                currentNum -= removedElement;
            }
            numList.set(i, currentNum);
        }
    }
}
