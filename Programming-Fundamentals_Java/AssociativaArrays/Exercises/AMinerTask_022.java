package AssociativaArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        LinkedHashMap<String, Integer> minerMap = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            String currentResource = resource;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!minerMap.containsKey(currentResource)) {
                minerMap.put(currentResource, quantity);
            } else {
                int currentQuantity = minerMap.get(currentResource);
                minerMap.put(currentResource, currentQuantity + quantity);
            }

            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : minerMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
