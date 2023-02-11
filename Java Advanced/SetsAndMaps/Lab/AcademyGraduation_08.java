package SetsAndMaps.Lab;

import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double[]> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            String[] gradesArr = scanner.nextLine().split(" ");
            Double[] grades = new Double[gradesArr.length];
            for (int j = 0; j < gradesArr.length; j++) {
                grades[j] = Double.parseDouble(gradesArr[j]);
            }
            map.put(name, grades);
        }
        for (String studentName : map.keySet()) {
            Double[] grades = map.get(studentName);
            double sum = 0;
            for (Double grade : grades) {
                sum += grade;
            }
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.printf("%s is graduated with %s%n", studentName, df.format(sum / grades.length));
        }
    }
}
