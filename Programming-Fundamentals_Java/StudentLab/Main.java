package StudentLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            int age = Integer.parseInt(inputArr[2]);
            String town = inputArr[3];
            Student currentStudent = new Student(firstName, lastName, age, town);
            studentList.add(currentStudent);


            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student item : studentList) {
            if (item.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
