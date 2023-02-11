package FunctinalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> count = n -> n.size();
        int countSize = count.apply(numbers);
        System.out.println("Count = " + countSize);
        int sum = numbers.stream().mapToInt(a -> a).sum();
        System.out.println("Sum = " + sum);
    }
}
