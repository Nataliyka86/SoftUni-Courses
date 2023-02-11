package Stacks_and_Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        ArrayDeque<String> intStack = new ArrayDeque<>();

        for (String num : inputArr) {
            intStack.push(num);
        }
        while (!intStack.isEmpty()) {
            System.out.print(intStack.pop() + " ");
        }
    }

}
