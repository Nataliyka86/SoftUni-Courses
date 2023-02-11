package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputDimensions = scanner.nextLine().split(" ");
        int firstRows = Integer.parseInt(inputDimensions[0]);
        int firstColumns = Integer.parseInt(inputDimensions[1]);

        int[][] firstMatrix = new int[firstRows][firstColumns];

        for (int i = 0; i < firstRows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < firstColumns; j++) {
                firstMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }
        inputDimensions = scanner.nextLine().split(" ");
        int secondRows = Integer.parseInt(inputDimensions[0]);
        int secondColumns = Integer.parseInt(inputDimensions[1]);

        int[][] secondMatrix = new int[secondRows][secondColumns];

        for (int i = 0; i < secondRows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < secondColumns; j++) {
                secondMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        if (firstRows != secondRows || firstColumns != secondColumns) {
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < firstRows; i++) {
            for (int j = 0; j < firstColumns; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
