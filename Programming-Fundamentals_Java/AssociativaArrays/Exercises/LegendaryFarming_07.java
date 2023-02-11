package AssociativaArrays.Exercises;

import java.util.*;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> farmMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();
        boolean isWin = false;

while (!isWin){
        String[] farmArr = scanner.nextLine().split(" ");
        int quantity = 0;
        for (int i = 0; i < farmArr.length; i++) {
            String material = "";
            if (i % 2 == 0) {
                quantity = Integer.parseInt(farmArr[i]);
                continue;
            } else {
                material = farmArr[i].toLowerCase();
                switch (material) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        if (!farmMap.containsKey(material)) {
                            farmMap.put(material, quantity);
                        } else {
                            int currentQuantity = farmMap.get(material);
                            farmMap.put(material, currentQuantity + quantity);
                        }
                        if (farmMap.get(material) >= 250) {
                            isWin = true;
                            farmMap.put(material, farmMap.get(material) - 250);
                            switch (material) {
                                case "shards":
                                    System.out.println("Shadowmourne obtained!");
                                    break;
                                case "fragments":
                                    System.out.println("Valanyr obtained!");
                                    break;
                                case "motes":
                                    System.out.println("Dragonwrath obtained!");
                                    break;
                            }
                            break;
                        }
                        break;

                    default:
                        if (!junkMap.containsKey(material)) {
                            junkMap.put(material, quantity);

                        } else {
                            int currentQuantity = junkMap.get(material);
                            junkMap.put(material, currentQuantity + quantity);
                        }
                        break;
                }
                if (isWin) {
                    break;
                }
            }
        }}
        farmMap.putIfAbsent("shards", 0);
        farmMap.putIfAbsent("fragments", 0);
        farmMap.putIfAbsent("motes", 0);

        System.out.printf("shards: %d%n", farmMap.get("shards"));
        System.out.printf("fragments: %d%n", farmMap.get("fragments"));
        System.out.printf("motes: %d%n", farmMap.get("motes"));
        for (Map.Entry<String, Integer> entry : junkMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
