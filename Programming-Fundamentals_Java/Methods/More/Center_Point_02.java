package Methods.More;

import java.util.Scanner;

public class Center_Point_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        double diagonal1 = calculateDiagonal(x1, y1);
        double diagonal2 = calculateDiagonal(x2, y2);
        if (diagonal1 <= diagonal2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }

    }

    public static double calculateDiagonal(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
