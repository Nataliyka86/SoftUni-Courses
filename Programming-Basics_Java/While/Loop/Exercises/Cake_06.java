package While.Loop.Exercises;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int allPieces = width * height;


        while (allPieces > 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int guests = Integer.parseInt(input);
            allPieces -= guests;

        }
        if (allPieces > 0) {
            System.out.printf("%d pieces are left.", allPieces);

        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces));
        }
    }

}
