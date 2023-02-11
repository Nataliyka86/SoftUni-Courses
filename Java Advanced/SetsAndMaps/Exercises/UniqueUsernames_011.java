package Advanced.SetAndMap;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> carsSet = new LinkedHashSet<>();

        for (int i = 1; i <= n; i++) {
            String currentCar = scanner.nextLine();
            carsSet.add(currentCar);
        }
        carsSet.forEach(System.out::println);
    }
}
