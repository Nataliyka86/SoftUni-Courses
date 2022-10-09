package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int capacity = 255;

        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += liters;
                capacity -= liters;
            }
        }
        System.out.println(sum);
    }
}
