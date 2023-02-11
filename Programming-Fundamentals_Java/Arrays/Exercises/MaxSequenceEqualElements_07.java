package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLength = 0;
        int length = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] == inputArr[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                bestStart = startIndex;
            }
        }
        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(inputArr[i] + " ");
        }
    }
}
