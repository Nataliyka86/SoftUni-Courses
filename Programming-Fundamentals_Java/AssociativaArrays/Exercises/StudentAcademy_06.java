package AssociativaArrays.Exercises;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<Double>> studentMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentMap.containsKey(name)) {
                studentMap.put(name, new ArrayList<>());
                studentMap.get(name).add(grade);
            } else {
                studentMap.get(name).add(grade);
            }
        }
        Map<String, Double> averageMap = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : studentMap.entrySet()) {
            List<Double> listGrade = entry.getValue();
            String studentName = entry.getKey();
            double averageGrade = getAverageGrade(listGrade);
            if (averageGrade >= 4.50) {
                averageMap.put(studentName, averageGrade);
            }
        }
        for (Map.Entry<String, Double> entry : averageMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }

    private static double getAverageGrade(List<Double> listGrade) {
        double sumGrades = 0;
        for (double grade : listGrade) {
            sumGrades += grade;
        }
        return sumGrades / listGrade.size();
    }
}
