package FunctinalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUppercase = w -> Character.isUpperCase(w.charAt(0));
        Consumer<String> print = w -> System.out.println(w);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).filter(w -> isUppercase.test(w)).collect(Collectors.toList());
        System.out.println(words.size());
        words.forEach(w -> print.accept(w));
    }
}
