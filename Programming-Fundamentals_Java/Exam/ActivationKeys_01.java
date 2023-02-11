package Exam;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] tokensArr = input.split(">>>");
            String command = tokensArr[0];
            switch (command) {
                case "Contains":
                    String substring = tokensArr[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = tokensArr[1];
                    int startIndex = Integer.parseInt(tokensArr[2]);
                    int endIndex = Integer.parseInt(tokensArr[3]);
                    if (upperOrLower.equals("Upper")) {
                        String substring2 = activationKey.substring(startIndex, endIndex);
                        activationKey = activationKey.replace(substring2, substring2.toUpperCase());
                    } else {
                        String substring2 = activationKey.substring(startIndex, endIndex);
                        activationKey = activationKey.replace(substring2, substring2.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startIndex2 = Integer.parseInt(tokensArr[1]);
                    int endIndex2 = Integer.parseInt(tokensArr[2]);
                    String substring3 = activationKey.substring(startIndex2, endIndex2);
                    activationKey = activationKey.replace(substring3, "");
                    System.out.println(activationKey);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
