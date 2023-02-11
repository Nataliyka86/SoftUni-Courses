package Advanced.SetAndMap;

import java.util.*;

public class CitiesContinentCountry_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> atlasMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            //continents, countries, and their cities
            String continents = input[0];
            String countries = input[1];
            String cities = input[2];

            if (!atlasMap.containsKey(continents)) {
                atlasMap.put(continents, new LinkedHashMap<>());
                atlasMap.get(continents).put(countries, new ArrayList<>());
                atlasMap.get(continents).get(countries).add(cities);
            } else {
                if (!atlasMap.get(continents).containsKey(countries)) {
                    atlasMap.get(continents).put(countries, new ArrayList<>());
                    atlasMap.get(continents).get(countries).add(cities);
                } else {
                    atlasMap.get(continents).get(countries).add(cities);
                }
            }
        }
        for (Map.Entry<String, Map<String, List<String>>> entry : atlasMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, List<String>> entryTwo : entry.getValue().entrySet()) {
                System.out.print(entryTwo.getKey() + " -> ");
                System.out.println(String.join(", ", entryTwo.getValue()));
            }
        }
    }
}
