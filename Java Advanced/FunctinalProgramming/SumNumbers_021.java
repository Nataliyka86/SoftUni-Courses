package Advanced.LambdaFunctinal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class SumNumbers_021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        int sum = 0;

        BiFunction<Integer, String, Integer> parseAndAdd = (acc, cur) -> acc + Integer.parseInt(cur);
        for (String number : numbers) {
            sum = parseAndAdd.apply(sum, number);
        }
        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);
    }
}
