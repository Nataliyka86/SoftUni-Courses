package Exams;

import java.util.ArrayList;
import java.util.Scanner;

public class Snake_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        int snakeRow = -1;
        int snakeCol = -1;
        int lairFirstRow = -1;
        int lairFirstCol = -1;
        int lairSecondRow = -1;
        int lairSecondCol = -1;

        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            matrix[i] = row.toCharArray();
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'S') {
                    snakeRow = i;
                    snakeCol = j;
                }
                if (matrix[i][j] == 'B') {
                    if (lairFirstRow == -1) {
                        lairFirstRow = i;
                        lairFirstCol = j;
                    } else {
                        lairSecondRow = i;
                        lairSecondCol = j;
                    }
                }
            }
        }

        int foodEaten = 0;
        while (foodEaten < 10) {
            String command = scanner.nextLine();
            matrix[snakeRow][snakeCol] = '.';
            switch (command) {
                case "left":
                    snakeCol--;
                    break;
                case "right":
                    snakeCol++;
                    break;
                case "down":
                    snakeRow++;
                    break;
                case "up":
                    snakeRow--;
                    break;
            }
            if (snakeRow < 0 || snakeRow >= n || snakeCol < 0 || snakeCol >= n) {
                break;
            }
            if (matrix[snakeRow][snakeCol] == '*') {
                foodEaten++;
            }

            if (snakeRow == lairFirstRow && snakeCol == lairFirstCol) {
                matrix[snakeRow][snakeCol] = '.';
                snakeRow = lairSecondRow;
                snakeCol = lairSecondCol;
            } else if (snakeRow == lairSecondRow && snakeCol == lairSecondCol) {
                matrix[snakeRow][snakeCol] = '.';
                snakeRow = lairFirstRow;
                snakeCol = lairFirstCol;
            }
            matrix[snakeRow][snakeCol] = 'S';
        }
        if (foodEaten >= 10) {
            System.out.println("You won! You fed the snake.");
        } else {
            System.out.println("Game over!");
        }
        System.out.printf("Food eaten: %d%n", foodEaten);
        for (
                int i = 0;
                i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}

