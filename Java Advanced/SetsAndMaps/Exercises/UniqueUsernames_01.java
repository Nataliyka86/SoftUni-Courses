package SetsAndMaps.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> texts = new LinkedHashSet<>();
        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            texts.add(word);
        }
//        for (String word : texts) {
//            System.out.println(word);
//        }
        texts.forEach(System.out::println);
    }
}
