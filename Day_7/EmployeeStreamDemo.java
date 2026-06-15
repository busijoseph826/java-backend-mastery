import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Joseph", 45000, "IT"));
        employees.add(new Employee(102, "John", 60000, "IT"));
        employees.add(new Employee(103, "David", 70000, "HR"));
        employees.add(new Employee(104, "Smith", 35000, "Finance"));
        employees.add(new Employee(105, "Mary", 80000, "IT"));
        employees.add(new Employee(106, "Emma", 52000, "HR"));
        employees.add(new Employee(107, "James", 90000, "IT"));
        employees.add(new Employee(108, "Robert", 48000, "Finance"));
        employees.add(new Employee(109, "Sophia", 75000, "IT"));
        employees.add(new Employee(110, "Daniel", 55000, "HR"));

        // ==========================================
        // FILTER
        // salary > 50000
        // ==========================================

        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .collect(Collectors.toList());

        System.out.println("Employees with Salary > 50000");
        highSalaryEmployees.forEach(System.out::println);

        // ==========================================
        // MAP
        // Employee -> Name
        // ==========================================

        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("\nEmployee Names");
        employeeNames.forEach(System.out::println);

        // ==========================================
        // COUNT
        // Employees from IT Department
        // ==========================================

        long itEmployeeCount = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .count();

        System.out.println("\nIT Employee Count = " + itEmployeeCount);

        // ==========================================
        // SORT
        // Sort by Salary
        // ==========================================

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("\nEmployees Sorted By Salary");
        sortedEmployees.forEach(System.out::println);

        // ==========================================
        // COLLECT
        // Collect HR employees into new list
        // ==========================================

        List<Employee> hrEmployees = employees.stream()
                .filter(emp -> emp.getDepartment().equals("HR"))
                .collect(Collectors.toList());

        System.out.println("\nHR Employees");
        hrEmployees.forEach(System.out::println);
    }
}

class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}