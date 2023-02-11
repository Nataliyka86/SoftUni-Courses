package ClassesObjects.Lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");
        Random rndGenerator = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int indexX = rndGenerator.nextInt(wordsArr.length);
            int indexY = rndGenerator.nextInt(wordsArr.length);
            String oldWordX = wordsArr[indexX];
            wordsArr[indexX] = wordsArr[indexY];
            wordsArr[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
