package FunctinalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesArr = scanner.nextLine().split("\\s+");
        Consumer<String> printNames = w -> System.out.println(w);
        Arrays.stream(namesArr).forEach(w -> printNames.accept(w));
    }
}
