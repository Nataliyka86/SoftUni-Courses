package TestProcessing.Exercises;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String str1 = input.split(" ")[0];
        String str2 = input.split(" ")[1];
        int totalSum = 0;

        if (str1.length() <= str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                int sum1 = (int) str1.charAt(i);
                int sum2 = (int) str2.charAt(i);
                totalSum += sum1 * sum2;
            }
            for (int i = str1.length(); i < str2.length(); i++) {
                totalSum += (int) str2.charAt(i);
            }
        } else {
            for (int i = 0; i < str2.length(); i++) {
                int sum1 = (int) str1.charAt(i);
                int sum2 = (int) str2.charAt(i);
                totalSum += sum1 * sum2;
            }
            for (int i = str2.length(); i < str1.length(); i++) {
                totalSum += (int) str1.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
