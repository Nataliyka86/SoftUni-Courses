package MultidimensionalArrays.Lab;

import javax.imageio.IIOParam;
import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        String[][] matrix1 = new String[row][col];
        String[][] matrix2 = new String[row][col];

        fillMatrix(matrix1, row, col, scanner);
        fillMatrix(matrix2, row, col, scanner);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!matrix1[i][j].equals(matrix2[i][j])) {
                    matrix1[i][j] = "*";
                }
            }
        }
        printMatrix(matrix1);
    }

    private static void printMatrix(String[][] matrix1) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix1, int row, int col, Scanner scanner) {
        for (int i = 0; i < row; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = input[j];
            }
        }
    }
}
