package Advanced.SetAndMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            firstSet.add(number);
        }
        for (int i = 0; i < m; i++) {
            int number = scanner.nextInt();
            secondSet.add(number);
        }
        firstSet.retainAll(secondSet);
        firstSet.forEach(el -> System.out.print(el + " "));
    }
}
