package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] newArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[i] + newArr[j] == number) {
                    System.out.printf("%d %d%n", newArr[i], newArr[j]);
                }
            }

        }
    }
}
