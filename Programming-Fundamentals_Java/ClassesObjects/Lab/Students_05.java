package ClassesObjects.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] studentsArr = input.split(" ");
            String firstName = studentsArr[0];
            String lastName = studentsArr[1];
            int age = Integer.parseInt(studentsArr[2]);
            String town = studentsArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentList.add(currentStudent);


            input = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentList) {
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
