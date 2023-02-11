package TestProcessing.Exercises;

import java.util.Scanner;

public class LettersChangeNumbers_088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        double allSum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            double result = 0;
            String currentText = inputArr[i];
            char firstSymbol = currentText.charAt(0);
            String digits = currentText.substring(1, currentText.length() - 1);
            int digit = Integer.parseInt(digits);
            if (Character.isUpperCase(firstSymbol)) {
                double divide = (int) firstSymbol - 64;
                result = digit / divide;
            } else {
                double divide = (int) firstSymbol - 96;
                result = digit * divide;
            }
            char lastSymbol = currentText.charAt(currentText.length() - 1);
            if (Character.isUpperCase(lastSymbol)) {
                double divide = (int) lastSymbol - 64;
                result = result - divide;
            } else {
                double divide = (int) lastSymbol - 96;
                result = result + divide;
            }
            allSum += result;
        }
        System.out.printf("%.2f", allSum);
    }
}
