package BasicSyntaxConditionalStatementsandLoops.More;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int average = 0;

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 3; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            list.add(number);
        }

        Collections.sort(list);


//        for (int i = 1; i <= 3; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//
//            if (number > max) {
//                max = number;
//            }
//            if (number < min) {
//                min = number;
//            }
//            if (max == number && min == number) {
//                average = number;
//            }
//        }



//        System.out.println(max);
//        System.out.println(average);
//        System.out.println(min);
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        System.out.println(list.get(0));
    }
}
