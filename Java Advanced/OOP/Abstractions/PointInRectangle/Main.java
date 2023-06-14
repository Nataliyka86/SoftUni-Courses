package OOP.Abstractions.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bottomLeftX = coordinates[0];
        int bottomLeftY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];

        Point pointBottomLeftRectangle = new Point(bottomLeftX, bottomLeftY);
        Point pointTopRightRectangle = new Point(topRightX,topRightY);
        Rectangle rectangle = new Rectangle(pointBottomLeftRectangle, pointTopRightRectangle);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] currentPointArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int currentX = currentPointArr[0];
            int currentY = currentPointArr[1];
            Point currentPoint = new Point(currentX, currentY);
            System.out.println(rectangle.contains(currentPoint));
        }
    }
}
