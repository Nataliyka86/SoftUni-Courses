package AssociativaArrays.Exercises;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> firstMap = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];
                if (!firstMap.containsKey(forceSide)) {
                    firstMap.put(forceSide, new ArrayList<>());
                }
                boolean isExisting = false;
                for (List<String> listUsers : firstMap.values()) {
                    if (listUsers.contains(forceUser)) {
                        isExisting = true;
                        break;
                    }
                }
                if (!isExisting) {
                    firstMap.get(forceSide).add(forceUser);
                }
            } else if (input.contains(" -> ")) {
                String forceSide = input.split("\\s+->\\s+")[1];
                String forceUser = input.split("\\s+->\\s+")[0];
                firstMap.entrySet().forEach(entry -> entry.getValue().remove(forceUser));
                if (firstMap.containsKey(forceSide)) {
                    firstMap.get(forceSide).add(forceUser);
                } else {
                    firstMap.put(forceSide, new ArrayList<>());
                    firstMap.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            input = scanner.nextLine();
        }
        firstMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    //if (entry.getValue().size() >0)
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}
