package MidExam;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheAngryCat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int index = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        int entryPointValue = numArr[index];
        int leftDamage = 0;
        int rightDamage = 0;
        int[] leftArr = new int[index];
        int indexRight = numArr.length - 1 - index;
        int[] rightArr = new int[indexRight];


        for (int i = 0; i < index; i++) {
            leftArr[i] = numArr[i];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = numArr[index + 1 + i];
        }
        if (type.equals("cheap")) {
            leftDamage = damageCheap(leftArr, entryPointValue);
            rightDamage = damageCheap(rightArr, entryPointValue);
            if (leftDamage >= rightDamage) {
                System.out.printf("Left - %d", leftDamage);
            } else {
                System.out.printf("Right - %d", rightDamage);
            }

        } else {
            leftDamage = damageExpensive(leftArr, entryPointValue);
            rightDamage = damageExpensive(rightArr, entryPointValue);
            if (leftDamage >= rightDamage) {
                System.out.printf("Left - %d", leftDamage);
            } else {
                System.out.printf("Right - %d", rightDamage);
            }
        }

    }

    public static int damageCheap(int[] damageArr, int damage) {
        int sumDamage = 0;
        for (int i = 0; i < damageArr.length; i++) {
            if (damageArr[i] < damage) {
                sumDamage += damageArr[i];
            }
        }
        return sumDamage;
    }

    public static int damageExpensive(int[] damageArr, int damage) {
        int sumDamage = 0;
        for (int i = 0; i < damageArr.length; i++) {
            if (damageArr[i] >= damage) {
                sumDamage += damageArr[i];
            }
        }
        return sumDamage;
    }
}
