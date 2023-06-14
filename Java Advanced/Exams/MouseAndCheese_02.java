package Exams;

import java.util.Scanner;

public class MouseAndCheese_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];

        int currentRow = -1;
        int currentCol = -1;
        int eatenCheese = 0;
        boolean mouseGoesOut = false;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals("M")) {
                    currentRow = i;
                    currentCol = j;
                }
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            matrix[currentRow][currentCol] = "-";
            switch (command) {
                case "up":
                    currentRow--;
                    if (!isValid(matrix, currentRow, currentCol)) {
                        mouseGoesOut = true;
                        break;
                    }
                    if (matrix[currentRow][currentCol].equals("B")) {
                        matrix[currentRow][currentCol] = "-";
                        currentRow--;
                    }

                    break;
                case "down":
                    currentRow++;
                    if (!isValid(matrix, currentRow, currentCol)) {
                        mouseGoesOut = true;
                        break;
                    }
                    if (matrix[currentRow][currentCol].equals("B")) {
                        matrix[currentRow][currentCol] = "-";
                        currentRow++;
                    }
                    break;
                case "left":
                    currentCol--;
                    if (!isValid(matrix, currentRow, currentCol)) {
                        mouseGoesOut = true;
                        break;
                    }
                    if (matrix[currentRow][currentCol].equals("B")) {
                        matrix[currentRow][currentCol] = "-";
                        currentCol--;
                    }
                    break;
                case "right":
                    currentCol++;
                    if (!isValid(matrix, currentRow, currentCol)) {
                        mouseGoesOut = true;
                        break;
                    }
                    if (matrix[currentRow][currentCol].equals("B")) {
                        matrix[currentRow][currentCol] = "-";
                        currentCol++;
                    }
                    break;
            }
            if (mouseGoesOut) {
                break;
            }
            if (matrix[currentRow][currentCol].equals("c")) {
                eatenCheese++;
            }
            matrix[currentRow][currentCol] = "M";
            command = scanner.nextLine();
        }
        if (mouseGoesOut) {
            System.out.println("Where is the mouse?");
        }
        if (eatenCheese < 5) {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - eatenCheese);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", eatenCheese);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isValid(String[][] matrix, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix.length) {
            return false;
        } else {
            return true;
        }
    }
}
