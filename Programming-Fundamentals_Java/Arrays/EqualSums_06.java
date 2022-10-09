package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;


        for (int i = 0; i < inputArr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < inputArr.length; j++) {
                if (j < i) {
                    sumLeft += inputArr[j];
                } else if (j > i) {
                    sumRight += inputArr[j];
                }
            }
            if (sumLeft == sumRight) {
                isFound = true;
                System.out.println(i);
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
