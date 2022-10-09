package DataTypesAndVariables.More;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        for (int i = 1; i <= n; i++) {
//            String leftNumber = "";
//            String rightNumber = "";
//            String text = scanner.nextLine();
//            boolean isFound = false;
//            for (int j = 0; j <= text.length() - 1; j++) {
//                if ((int) text.charAt(j) == 32) {
//                    isFound = true;
//                    continue;
//
//                }
//                if (!isFound) {
//                    leftNumber += text.charAt(j);
//                }
//                if (isFound) {
//                    rightNumber += text.charAt(j);
//                }
//
//            }
//            int left = Integer.parseInt(leftNumber);
//            int right = Integer.parseInt(rightNumber);
//            int sum = 0;
//            int maxNumber = Integer.MIN_VALUE;
//            if (left > right) {
//                maxNumber = left;
//
//            } else {
//                maxNumber = right;
//            }
//            while (maxNumber > 0) {
//                sum += maxNumber / 10;
//                maxNumber = maxNumber % 10;
//            }
//            System.out.println(sum);
//
//        }
        for (int i = 1; i <=n ; i++) {
            String lines = scanner.nextLine();
            String[] linesArr = lines.split(" ");
            int[] arr = new int[linesArr.length];

            for (int j = 0; j < lines.length(); j++) {
                arr[j] = Integer.parseInt(linesArr[i]);

            }
        }


    }
}
