package Exams;

import java.util.Scanner;

public class Armory_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];
        int currentRow = -1;
        int currentCol = -1;
        int firstRowMirror = -1;
        int firstColMirror = -1;
        int secondRowMirror = -1;
        int secondColMirror = -1;


        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'A') {
                    currentRow = i;
                    currentCol = j;
                }
                if (matrix[i][j] == 'M') {
                    if (firstRowMirror == -1) {
                        firstRowMirror = i;
                        firstColMirror = j;
                    } else {
                        secondRowMirror = i;
                        secondColMirror = j;
                    }
                }
            }
        }
        int amount = 0;
        while (amount < 65) {
            String command = scanner.nextLine();
            matrix[currentRow][currentCol] = '-';
            switch (command) {
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
            }
            if (currentRow < 0 || currentRow >= n || currentCol < 0 || currentCol >= n) {
                break;
            }
            if (matrix[currentRow][currentCol] == 'M') {
                if (currentRow == firstRowMirror && currentCol == firstColMirror) {
                    currentRow = secondRowMirror;
                    currentCol = secondColMirror;
                } else {
                    currentRow = firstRowMirror;
                    currentCol = firstColMirror;
                }
                matrix[firstRowMirror][firstColMirror] = '-';
                matrix[secondRowMirror][secondColMirror] = '-';
            }
            if (Character.isDigit(matrix[currentRow][currentCol])) {
                amount += Integer.parseInt(String.valueOf(matrix[currentRow][currentCol]));
            }
            matrix[currentRow][currentCol] = 'A';
        }

        if (amount >= 65) {
            System.out.println("Very nice swords, I will come back for more!");
        } else {
            System.out.println("I do not need more swords!");
        }
        System.out.printf("The king paid %d gold coins.%n", amount);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
