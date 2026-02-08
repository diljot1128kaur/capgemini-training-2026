import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDataProcessing {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Engineering", 90000),
            new Employee(2, "Riya", "Engineering", 85000),
            new Employee(3, "Kunal", "HR", 70000),
            new Employee(4, "Neha", "Engineering", 95000)
        );

        Map<String, Double> avgSalary =
            employees.stream()
                .filter(e -> e.getDepartment().equals("Engineering"))
                .filter(e -> e.getSalary() > 80000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(avgSalary);
    }
}
