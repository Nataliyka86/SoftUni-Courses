package Methods.More;

import java.util.Scanner;

public class Longer_Line_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        int distanceX1 = distance(x1, x2);
        int distanceY1 = distance(y1, y2);
        int distanceX2 = distance(x3, x4);
        int distanceY2 = distance(y3, y4);
        double diagonal1 = calculateDiagonal(distanceX1, distanceY1);
        double diagonal2 = calculateDiagonal(distanceX2, distanceY2);
        if (diagonal1 >= diagonal2) {
            double diagonal11 = calculateDiagonal(x1, y1);
            double diagonal12 = calculateDiagonal(x2, y2);
            if (diagonal11 <= diagonal12) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            }
        } else {
            double diagonal11 = calculateDiagonal(x3, y3);
            double diagonal12 = calculateDiagonal(x4, y4);
            if (diagonal11 <= diagonal12) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            }

        }

    }

    public static int distance(int x, int y) {
        int distance = 0;
        if ((x >= 0 && y >= 0) || (x < 0 && y < 0)) {
            distance = Math.abs(x - y);
        } else {
            distance = Math.abs(x) + Math.abs(y);
        }
        return distance;
    }

    public static double calculateDiagonal(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
