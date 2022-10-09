package Exams.July.Second;

import java.util.Scanner;

public class Renovation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();


        int area = height * width * 4;
        area = (area - (area * percent / 100));

        while (!command.equals("Tired!")) {
            int liters = Integer.parseInt(command);
            area -= liters;
            if (area <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (area > 0) {
            System.out.printf("%d quadratic m left.", area);
        } else if (area == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(area));
        }
    }
}
