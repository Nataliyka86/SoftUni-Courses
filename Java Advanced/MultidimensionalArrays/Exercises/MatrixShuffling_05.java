package MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int row = Integer.parseInt(input.split(" ")[0]);
        int col = Integer.parseInt(input.split(" ")[1]);

        String[][] matrix = new String[row][col];

        fillMatrix(matrix, scanner);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            if (validateCommand(command, row, col)) {
                String[] commandArr = command.split("\\s+");
                int row1 = Integer.parseInt(commandArr[1]);
                int col1 = Integer.parseInt(commandArr[2]);
                int row2 = Integer.parseInt(commandArr[3]);
                int col2 = Integer.parseInt(commandArr[4]);
                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];
                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                printMatrix(matrix);

            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean validateCommand(String command, int row, int col) {
        String[] commandArr = command.split("\\s+");
        if (commandArr.length != 5) {
            return false;
        }
        if (!commandArr[0].equals("swap")) {
            return false;
        }
        int row1 = Integer.parseInt(commandArr[1]);
        int col1 = Integer.parseInt(commandArr[2]);
        int row2 = Integer.parseInt(commandArr[3]);
        int col2 = Integer.parseInt(commandArr[4]);
        if (row1 < 0 || row1 >= row || row2 < 0 || row2 >= row || col1 < 0 || col1 >= col || col2 < 0 || col2 >= col) {
            return false;
        }
        return true;

    }


    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");

        }
    }
}
