package TestProcessing.Exercises;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codeArr = input.split("\\s+");

        double totalSum = 0.00;
        for (String code : codeArr) {
            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);

    }

    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(lastLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            int positionUpperLetter = (int) firstLetter - 64;
            number = number / positionUpperLetter;
        } else {
            int positionLowerLetter = (int) firstLetter - 96;
            number = number * positionLowerLetter;
        }
        if (Character.isUpperCase(lastLetter)) {
            int positionUpperLetter = (int) lastLetter - 64;
            number = number - positionUpperLetter;
        } else {
            int positionLowerLetter = (int) lastLetter - 96;
            number = number + positionLowerLetter;
        }
        return number;
    }
}
