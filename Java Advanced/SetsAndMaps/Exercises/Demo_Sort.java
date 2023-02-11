package SetsAndMaps.Exercises;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Demo_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //sort in descending order

        Map<String, List<Double>> studentGrade = new HashMap<>();
        studentGrade.entrySet().stream().sorted((s1, s2) -> s2.getValue().size() - s1.getValue().size());

        //sort in ascending order
        studentGrade.entrySet().stream().sorted((s1, s2) -> s1.getValue().size() - s2.getValue().size());

        //sorted -> > 0 -> разменя записите
        //sorted -> <= 0 -> не разменя записите

        Map<String, Integer> people = new HashMap<>();

        //  sort ascending order
        people.entrySet().stream().sorted(comparingByKey());

        // sort by keys in descending order
        people.entrySet().stream().sorted(Collections.reverseOrder(comparingByKey()));

        //sort by value in ascending order
        people.entrySet().stream().sorted(comparingByValue());

        //sort by value in descending order
        people.entrySet().stream().sorted(Collections.reverseOrder(comparingByValue()));

        //съхраняване в нов мап вече сортирания
        Map<String, Integer> sortedMa = people.entrySet().stream().sorted().sorted(comparingByKey()).collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e2, LinkedHashMap:: new));

    }
}
