package FunctinalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        Function<List<Integer>, List<Integer>> addFunc = list -> list.stream().map(n -> n += 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiplyFunc = list -> list.stream().map(n -> n *= 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtractFunc = list -> list.stream().map(n -> n -= 1).collect(Collectors.toList());
        Consumer<List<Integer>> print = list -> list.forEach(n -> System.out.print(n + " "));

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numberList = addFunc.apply(numberList);
//                    numberList = numberList.stream().map(n -> n += 1).collect(Collectors.toList());
                    break;
                case "multiply":
                    numberList = multiplyFunc.apply(numberList);
                    break;
                case "subtract":
                    numberList = subtractFunc.apply(numberList);
                    break;
                case "print":
                    print.accept(numberList);
                    System.out.println();
                    break;

            }

            command = scanner.nextLine();
        }
    }
}
