package OOP.Abstractions.StudentSystem_033;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[] commandArr) {
        String command = commandArr[0];
        String name = commandArr[1];

        if (command.equals("Create")) {
            CreateStudent(commandArr, name);
        } else if (command.equals("Show")) {
            ShowStudent(name);
        }
    }

    private void ShowStudent(String name) {
        if (repo.containsKey(name)) {
            Student student = repo.get(name);
            StringBuilder sb = new StringBuilder();
            sb.append(student);

            if (student.getGrade() >= 5.00) {
                sb.append(" Excellent student.");
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                sb.append(" Average student.");
            } else {
                sb.append(" Very nice person.");
            }

            System.out.println(sb);
        }
    }

    private void CreateStudent(String[] commandArr, String name) {
        int age = Integer.parseInt(commandArr[2]);
        double grade = Double.parseDouble(commandArr[3]);
        if (!repo.containsKey(name)) {
            Student student = new Student(name, age, grade);
            repo.put(name, student);
        }
    }
}
