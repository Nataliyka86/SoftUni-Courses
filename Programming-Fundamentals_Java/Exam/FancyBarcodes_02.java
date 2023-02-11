package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+([A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < barcode.length(); j++) {
                    char currentSymbol = barcode.charAt(j);
                    if (Character.isDigit(currentSymbol)) {
                        sb.append(currentSymbol);
                    }
                }
                if (sb.length() == 0) {
                    sb.append("00");
                }
                System.out.printf("Product group: %s%n", sb.toString());
            } else {
                System.out.println("Invalid barcode");
            }

        }

    }
}
