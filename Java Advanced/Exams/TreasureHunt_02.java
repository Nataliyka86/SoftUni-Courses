package Exams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fieldDimensions = scanner.nextLine();
        int rows = Integer.parseInt(fieldDimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(fieldDimensions.split("\\s+")[1]);
        List<String> directionsList = new ArrayList<>();

        String[][] matrix = new String[rows][cols];

        int currentRow = -1;
        int currentCol = -1;

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("Y")) {
                    currentRow = i;
                    currentCol = j;
                }
            }
        }

        String directions = scanner.nextLine();
        while (!directions.equals("Finish")) {
            switch (directions) {
                case "up":
                    currentRow--;
                    if (currentRow < 0 || matrix[currentRow][currentCol].equals("T")) {
                        currentRow++;
                    } else {
                        directionsList.add(directions);
                    }
                    break;
                case "down":
                    currentRow++;
                    if (currentRow >= rows || matrix[currentRow][currentCol].equals("T")) {
                        currentRow--;
                    } else {
                        directionsList.add(directions);
                    }
                    break;
                case "right":
                    currentCol++;
                    if (currentCol >= cols || matrix[currentRow][currentCol].equals("T")) {
                        currentCol--;
                    } else {
                        directionsList.add(directions);
                    }
                    break;
                case "left":
                    currentCol--;
                    if (currentCol < 0 || matrix[currentRow][currentCol].equals("T")) {
                        currentCol++;
                    } else {
                        directionsList.add(directions);
                    }
                    break;
            }
            directions = scanner.nextLine();
        }

        if (matrix[currentRow][currentCol].equals("X")) {
            System.out.println("I've found the treasure!");
            System.out.println("The right path is " + String.join(", ", directionsList));
        } else {
            System.out.println("The map is fake!");
        }
    }
}
