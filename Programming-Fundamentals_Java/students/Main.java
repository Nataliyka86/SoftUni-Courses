package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= countStudent; i++) {
            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            String lastName = data.split(" ")[1];
            double grade = Double.parseDouble(data.split(" ")[2]);

            Student student = new Student(name, lastName, grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
