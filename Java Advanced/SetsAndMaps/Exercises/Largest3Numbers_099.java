package Advanced.SetAndMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Largest3Numbers_099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted(Comparator.reverseOrder()).toList();

        int limit = Math.min(numbers.size(), 3);
        for (int i = 0; i < limit; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
