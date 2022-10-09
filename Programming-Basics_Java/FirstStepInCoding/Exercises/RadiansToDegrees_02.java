package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        //градус = радиан * 180 / π
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);

    }
}
