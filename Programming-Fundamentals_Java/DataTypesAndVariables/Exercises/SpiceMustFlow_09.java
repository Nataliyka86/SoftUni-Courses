package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spices = Integer.parseInt(scanner.nextLine());
        int extracted = spices;
        int total = 0;
        int days = 0;

        while (extracted >= 100) {
            spices = extracted - 26;
            days++;
            extracted = extracted - 10;
            total += spices;
            if (extracted < 100) {
                total -= 26;
                break;
            }
        }
        System.out.println(days);
        System.out.println(total);
    }
}
