package Advanced.Classes.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departmentMap = new HashMap<>();
        Employee employee;
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position, department, email, age);
                if (!departmentMap.containsKey(department)) {
                    departmentMap.put(department, new ArrayList<>());
                    departmentMap.get(department).add(employee);
                } else {
                    departmentMap.get(department).add(employee);
                }
            } else if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
                if (!departmentMap.containsKey(department)) {
                    departmentMap.put(department, new ArrayList<>());
                    departmentMap.get(department).add(employee);
                } else {
                    departmentMap.get(department).add(employee);
                }
            } else if (input.length == 5) {
                if (Character.isDigit(input[4].charAt(0))) {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                } else {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }
                if (!departmentMap.containsKey(department)) {
                    departmentMap.put(department, new ArrayList<>());
                    departmentMap.get(department).add(employee);
                } else {
                    departmentMap.get(department).add(employee);
                }
            }
        }

    }
    public double getAverageSalary(Map<String, Employee> departmentMap) {
        double sumSalary = 0;
        for (Employee employee : departmentMap.values()) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / departmentMap.size();

    }
}
