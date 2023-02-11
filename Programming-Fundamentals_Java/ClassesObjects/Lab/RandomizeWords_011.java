package ClassesObjects.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int i = 0; i < input.length; i++) {
            int number = rnd.nextInt(input.length);
            String firstNum = input[number];
            String secondNum = input[i];
            input[number] = secondNum;
            input[i] = firstNum;

        }
        for (String item : input) {
            System.out.println(item);
        }
    }
}
