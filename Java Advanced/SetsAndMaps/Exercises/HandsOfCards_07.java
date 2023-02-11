package SetsAndMaps.Exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGrade = new HashMap<>();
        studentGrade.entrySet().stream().sorted((s1, s2) -> s2.getValue().size() - s1.getValue().size());
    }
}
