package Advanced.SetAndMap;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation_088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studentMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] gradeArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            double sumGrade = 0.00;
            for (int j = 0; j < gradeArr.length; j++) {
                sumGrade += gradeArr[j];
            }
            double averageScore = sumGrade / gradeArr.length;
            studentMap.put(name, averageScore);
        }
        for (Map.Entry<String, Double> entry : studentMap.entrySet()) {
            String currentScore = Double.toString(entry.getValue()).replaceAll((String) "\\.0$", "");
            System.out.printf("%s is graduated with %s%n", entry.getKey(), currentScore);
        }
    }
}
