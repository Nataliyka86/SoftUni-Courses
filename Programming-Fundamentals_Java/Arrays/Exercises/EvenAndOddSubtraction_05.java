package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr[i] % 2 == 0) {
                evenSum += numsArr[i];
            } else {
                oddSum += numsArr[i];
            }
        }
        System.out.printf("%d", evenSum - oddSum);
    }
}
