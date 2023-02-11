package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> composerMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> keyMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];
            composerMap.put(piece, composer);
            keyMap.put(piece, key);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandArr = command.split("\\|");
            switch (commandArr[0]) {
                case "Add":
                    String piece = commandArr[1];
                    String composer = commandArr[2];
                    String key = commandArr[3];
                    if (composerMap.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        composerMap.put(piece, composer);
                        keyMap.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    String piece2 = commandArr[1];
                    if (composerMap.containsKey(piece2)) {
                        composerMap.remove(piece2);
                        keyMap.remove(piece2);
                        System.out.printf("Successfully removed %s!%n", piece2);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece2);
                    }
                    break;
                case "ChangeKey":
                    String piece3 = commandArr[1];
                    String key3 = commandArr[2];
                    if (keyMap.containsKey(piece3)) {
                        keyMap.put(piece3, key3);
                        System.out.printf("Changed the key of %s to %s!%n", piece3, key3);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece3);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : composerMap.entrySet()) {
            String newKey = keyMap.get(entry.getKey());
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), newKey);
        }

    }
}
