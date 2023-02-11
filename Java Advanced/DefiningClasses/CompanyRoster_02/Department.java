package CompanyRoster_02;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Department {
    private String department;
    private List<Employee> employeeList = new ArrayList<>();

    public Department(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public void addNewEmployee (Employee employee){
        employeeList.add(employee);
    }
    public double averageSalary() {
//        OptionalDouble averageSalary = employeeList.stream().mapToDouble(e -> e.getSalary()).average();
//        return averageSalary.isPresent() ? averageSalary.getAsDouble() : 0;
        return employeeList.stream().mapToDouble(e -> e.getSalary()).average().orElse(0.0);
    }
}
