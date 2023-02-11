package Advanced.SetAndMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> chemicalSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] chemicalArr = scanner.nextLine().split("\\s+");
            for (String element : chemicalArr) {
                chemicalSet.add(element);
            }
        }
        chemicalSet.forEach(el -> System.out.print(el + " "));
    }
}
