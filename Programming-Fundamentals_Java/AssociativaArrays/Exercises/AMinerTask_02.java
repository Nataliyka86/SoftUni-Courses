package AssociativaArrays.Exercises;

import java.util.*;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<Integer>> minerMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            if (!minerMap.containsKey(input)) {
                minerMap.put(input, new ArrayList<>());
                String currentResource = input;
                input = scanner.nextLine();
                if (input.equals("stop")) {
                    break;
                }
                int quantity = Integer.parseInt(input);
                minerMap.get(currentResource).add(quantity);

            } else {
                String currentResource = input;
                input = scanner.nextLine();
                if (input.equals("stop")) {
                    break;
                }
                int quantity = Integer.parseInt(input);
                minerMap.get(currentResource).add(quantity);
            }
            input = scanner.nextLine();
        }
        LinkedHashMap<String, Integer> sumMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Integer>> entry : minerMap.entrySet()) {
            String resource = entry.getKey();
            List<Integer> quantityList = entry.getValue();
            int sum = getSumMap(quantityList);
            sumMap.put(resource, sum);
        }
        for (Map.Entry<String, Integer> entry : sumMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static int getSumMap(List<Integer> quantityList) {
        int sum = 0;
        for (int item : quantityList) {
            sum += item;
        }
        return sum;
    }
}
