package SetsAndMaps.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= sizeFirstSet; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            firstSet.add(numbers);
        }
        for (int i = 1; i <= sizeSecondSet; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            secondSet.add(numbers);
        }
//        for (int num : firstSet) {
//            if (secondSet.contains(num)){
//               System.out.print(num + " ");
//            }
//        }

        firstSet.retainAll(secondSet);
        firstSet.forEach(el -> System.out.print(el + " "));
    }
}
