package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class CompareMatrices_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int row1 = Integer.parseInt(input.split("\\s+")[0]);
        int col1 = Integer.parseInt(input.split("\\s+")[1]);
        boolean isEqual = false;

        int[][] matrix1 = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            String[] tokensArr = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = Integer.parseInt(tokensArr[j]);
            }
        }

        String input2 = scanner.nextLine();
        int row2 = Integer.parseInt(input2.split("\\s+")[0]);
        int col2 = Integer.parseInt(input2.split("\\s+")[1]);

        int[][] matrix2 = new int[row2][col2];

        for (int i = 0; i < row2; i++) {
            String[] tokensArr = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = Integer.parseInt(tokensArr[j]);
            }
        }
        if (row1 != row2 || col1 != col2) {
            System.out.println("not equal");
        } else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (matrix1[i][j] != matrix2[i][j]) {
                        System.out.println("not equal");
                        isEqual = false;
                        break;
                    } else {
                        isEqual = true;

                    }
                }
                if (!isEqual) {
                    break;
                }
            }
        }
        if (isEqual) {
            System.out.println("equal");
        }
    }
}
