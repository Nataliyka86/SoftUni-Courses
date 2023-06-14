package OOP.Abstractions.JediGalaxy_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readAndInitialMatrix(scanner);

        String command = scanner.nextLine();
        long sum = 0;

        while (!command.equals("Let the Force be with you")) {
            int[] jediCoordsArr = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            Coords jediCoords = new Coords(jediCoordsArr[0], jediCoordsArr[1] );
            int[] evilCoords = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            moveEvilAndDestroyStars(matrix, new Coords(evilCoords[0], evilCoords[1] ));
            sum += moveJediAndAddStars(matrix, new Coords(jediCoordsArr[0], jediCoordsArr[1]));

            command = scanner.nextLine();
        }

        System.out.println(sum);

    }

    private static long moveJediAndAddStars(int[][] matrix, Coords jediCoords) {
               long sum = 0;

        while (canJediStillMove(matrix, jediCoords)) {
            if (isInMatrix( matrix, jediCoords)) {
                sum += matrix[jediCoords.row][jediCoords.col];
            }

            jediCoords.col++;
            jediCoords.row--;
        }
        return sum;
    }

    private static void moveEvilAndDestroyStars(int[][] matrix, Coords evilCoords) {

        while (canEvilStillMove(evilCoords)) {
            if (isInMatrix(matrix, evilCoords )) {
                matrix[evilCoords.row][evilCoords.col] = 0;
            }
            evilCoords.row--;
            evilCoords.col--;
        }
    }

    private static boolean isInMatrix(int[][] matrix, Coords coords) {
        int matrixLength = matrix[0].length;
        return coords.row >= 0 && coords.row < matrix.length && coords.col >= 0 && coords.col < matrix[0].length;
    }

    private static boolean canJediStillMove(int[][] matrix, Coords coords) {
        return  coords.row>= 0 && coords.col < matrix[1].length;
    }

    private static boolean canEvilStillMove(Coords coords) {
        return coords.row >= 0 && coords.col >= 0;
    }

    private static int[][] readAndInitialMatrix(Scanner scanner) {
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimensions[0];
        int y = dimensions[1];

        int[][] matrix = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
