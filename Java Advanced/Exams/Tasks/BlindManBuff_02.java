package Exams.Tasks;

import java.util.Scanner;

public class BlindManBuff_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int row = Integer.parseInt(input.split("\\s+")[0]);
        int col = Integer.parseInt(input.split("\\s+")[1]);

        String[][] matrix = new String[row][col];
        int currentRow = -1;
        int currentCol = -1;
        int touchedOpponents = 0;
        int moves = 0;

        for (int i = 0; i < row; i++) {
            matrix[i] = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                if (matrix[i][j].equals("B")) {
                    currentRow = i;
                    currentCol = j;
                }
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            matrix[currentRow][currentCol] = "-";
            switch (command) {
                case "up":
                    currentRow--;
                    if (currentRow < 0 || matrix[currentRow][currentCol].equals("O")) {
                        currentRow++;
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "down":
                    currentRow++;
                    if (currentRow >= row || matrix[currentRow][currentCol].equals("O")) {
                        currentRow--;
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "right":
                    currentCol++;
                    if (currentCol >= col || matrix[currentRow][currentCol].equals("O")) {
                        currentCol--;
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "left":
                    currentCol--;
                    if (currentCol < 0 || matrix[currentRow][currentCol].equals("O")) {
                        currentCol++;
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
            }
            if (matrix[currentRow][currentCol].equals("P")) {
                touchedOpponents++;
                moves++;
            }
            if (matrix[currentRow][currentCol].equals("-")) {
                moves++;
            }
            if (touchedOpponents >= 3) {
                break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d%n", touchedOpponents, moves);
    }
}
