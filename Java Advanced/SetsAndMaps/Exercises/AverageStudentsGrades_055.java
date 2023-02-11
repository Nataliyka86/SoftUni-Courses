package Advanced.SetAndMap;

import java.util.*;

public class AverageStudentsGrades_055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (studentMap.containsKey(name)) {
                studentMap.get(name).add(grade);
            } else {
                studentMap.put(name, new ArrayList<>());
                studentMap.get(name).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : studentMap.entrySet()) {
            double averageGrade = 0;
            System.out.print(entry.getKey() + " -> ");
            for (double grade : entry.getValue()) {
                averageGrade += grade;
                System.out.printf("%.2f ", grade);
            }
            averageGrade = averageGrade / entry.getValue().size();
            System.out.printf("(avg: %.2f)%n", averageGrade);
        }
    }
}
