package CompanyRoster_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Employee employee;
        Map<String, Department> departmentMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            employee = new Employee(name, salary, position, department);
            if (input.length == 5) {
                if (Character.isDigit(input[4].charAt(0))) {
                    int age = Integer.parseInt(input[4]);
                    employee.setAge(age);
                } else {
                    String email = input[4];
                    employee.setEmail(email);
                }
            } else if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee.setEmail(email);
                employee.setAge(age);
            }

            Department departmentObj;
            if (!departmentMap.containsKey(department)) {
                departmentObj = new Department(department);
            } else {
                departmentObj = departmentMap.get(department);
            }
            departmentObj.addNewEmployee(employee);
            departmentMap.put(department, departmentObj);
        }

        Department maxAverageSalaryDepartment = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().averageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getDepartment());
        maxAverageSalaryDepartment.getEmployeeList()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee2 -> System.out.println(employee2.toString()));

    }
}
