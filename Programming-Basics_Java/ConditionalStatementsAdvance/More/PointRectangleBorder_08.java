package ConditionalStatementsAdvance.More;

import java.util.Scanner;

public class PointRectangleBorder_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //x1, y1, x2, y2, x и y

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if ((x == x1 || x == x2) && ((y >= y1) && (y <= y2))) {
            System.out.println("Border");
        } else if ((y == y1 || y == y2) && ((x >= x1) && (x <= x2))) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
