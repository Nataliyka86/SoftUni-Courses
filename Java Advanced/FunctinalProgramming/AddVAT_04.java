package FunctinalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());

        Function<Double, Double> vat = n -> n * 1.20;
        System.out.println("Prices with VAT:");
        numbers.forEach(n -> System.out.printf("%.2f%n", vat.apply(n)));
    }
}
