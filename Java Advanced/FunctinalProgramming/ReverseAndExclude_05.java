package FunctinalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbersList);
        //Predicate<Integer> removeNumber = e -> e % n == 0;
        Consumer<List<Integer>> printList = list -> list.forEach(s -> System.out.print(s + " "));
        //numbersList.removeIf(removeNumber);
        numbersList = numbersList.stream()
                .filter(e -> e % n != 0)
                .collect(Collectors.toList());

        printList.accept(numbersList);

    }
}
