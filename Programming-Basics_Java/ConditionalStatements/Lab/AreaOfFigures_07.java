package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area = 0.00;


        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        } else if (figure.equals("rectangle")){
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            area = side1 * side2;
        } else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;
        } else if (figure.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (side * height) / 2;

        }
        System.out.printf("%.3f",area);
    }
}
