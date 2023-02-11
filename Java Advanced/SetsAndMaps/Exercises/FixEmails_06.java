package SetsAndMaps.Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> emailMap = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                emailMap.put(name, email);
            }
            name = scanner.nextLine();
        }
//        emailMap.entrySet().removeIf(entry -> entry.getValue().endsWith("uk") || entry.getValue().endsWith("us") || entry.getValue().endsWith("com"));
        emailMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
