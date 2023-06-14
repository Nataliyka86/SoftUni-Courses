package Exams;

import java.util.Scanner;

public class PawnWars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];
        int rowWhite = -1;
        int colWhite = -1;
        int rowBlack = -1;
        int colBlack = -1;
        String col = "";
        String row = "";

        for (int i = 0; i < 8; i++) {
            matrix[i] = scanner.nextLine().split("");
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j].equals("w")) {
                    rowWhite = i;
                    colWhite = j;
                }
                if (matrix[i][j].equals("b")) {
                    rowBlack = i;
                    colBlack = j;
                }
            }
        }
        while (rowBlack < 7 && rowWhite > 0) {
            if (rowBlack + 1 == rowWhite && colBlack - 1 == colWhite) {
                col = getCol(colBlack);
                row = getRow(rowBlack);
                System.out.printf("Game over! White capture on %s%s.%n", col, row);
                break;
            } else if (rowBlack + 1 == rowWhite && colBlack + 1 == colWhite) {
                col = getCol(colBlack);
                row = getRow(rowBlack);
                System.out.printf("Game over! White capture on %s%s.%n", col, row);
                break;
            } else {
                rowWhite--;
                if (rowWhite == 0) {
                    col = getCol(colWhite);
                    row = getRow(0);
                    System.out.printf("Game over! White pawn is promoted to a queen at %s%s.%n", col, row);
                    break;
                }
            }
            if (rowBlack + 1 == rowWhite && colBlack - 1 == colWhite) {
                col = getCol(colWhite);
                row = getRow(rowWhite);
                System.out.printf("Game over! Black capture on %s%s.%n", col, row);
                break;
            } else if (rowBlack + 1 == rowWhite && colBlack + 1 == colWhite) {
                col = getCol(colWhite);
                row = getRow(rowWhite);
                System.out.printf("Game over! Black capture on %s%s.%n", col, row);
                break;
            } else {
                rowBlack++;
                if (rowBlack == 7) {
                    col = getCol(colBlack);
                    row = getRow(7);
                    System.out.printf("Game over! Black pawn is promoted to a queen at %s%s.%n", col, row);
                    break;
                }
            }
        }
    }

    public static String getCol(int j) {
        String col = "";
        if (j == 0) {
            col = "a";
        } else if (j == 1) {
            col = "b";
        } else if (j == 2) {
            col = "c";
        } else if (j == 3) {
            col = "d";
        } else if (j == 4) {
            col = "e";
        } else if (j == 5) {
            col = "f";
        } else if (j == 6) {
            col = "g";
        } else if (j == 7) {
            col = "h";
        }
        return col;
    }

    private static String getRow(int i) {
        String row = "";
        if (i == 0) {
            row = "8";
        } else if (i == 1) {
            row = "7";
        } else if (i == 2) {
            row = "6";
        } else if (i == 3) {
            row = "5";
        } else if (i == 4) {
            row = "4";
        } else if (i == 5) {
            row = "3";
        } else if (i == 6) {
            row = "2";
        } else if (i == 7) {
            row = "1";
        }
        return row;
    }
}
