package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] newArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < newArr.length - 1; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < newArr.length; j++) {
                if (!(newArr[i] > newArr[j])) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.printf("%d ", newArr[i]);
            }
        }
        System.out.println(newArr[newArr.length - 1]);
    }
}
