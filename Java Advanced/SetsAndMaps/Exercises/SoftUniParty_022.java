package Advanced.SetAndMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guests = scanner.nextLine();
        Set<String> guestSet = new TreeSet<>();

        while (!guests.equals("PARTY")) {
            guestSet.add(guests);
            guests = scanner.nextLine();
        }
        while (!guests.equals("END")) {
            guestSet.remove(guests);

            guests = scanner.nextLine();
        }
        System.out.println(guestSet.size());
        guestSet.forEach(System.out::println);
    }
}
