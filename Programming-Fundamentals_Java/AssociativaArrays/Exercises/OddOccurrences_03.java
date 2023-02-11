package AssociativaArrays;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> givenMap = new LinkedHashMap<>();
        for (String word : wordArr){
            word = word.toLowerCase();
            if (!givenMap.containsKey(word)){
                givenMap.put(word, 1);
            } else {
                int currentNum = givenMap.get(word) + 1;
               givenMap.put(word, currentNum);
            }
        }
        List<String> newLIst = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : givenMap.entrySet()) {
            if (entry.getValue() % 2 !=0) {
                newLIst.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", newLIst));

    }
}
