package TestProcessing.Exercises;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int totalStrength = 0;
        for (int i = 0; i < sb.length(); i++) {
            char currentSymbol = sb.charAt(i);
            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(sb.charAt(i + 1) + "");
                totalStrength += explosionStrength;

            } else if (totalStrength > 0) {
                sb.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(sb);
    }
}
