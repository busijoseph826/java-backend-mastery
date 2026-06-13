/*Practical Exercise 1
Predicate<Employee>

A Predicate is used when:

Input → Some Object
Output → boolean*/

/*
High Salary Predicate

Suppose:

salary > 50000
Predicate<Employee> highSalary =
        emp -> emp.getSalary() > 50000;
*/
/*
IT Department Predicate
Predicate<Employee> itDepartment =
        emp -> emp.getDepartment().equalsIgnoreCase("IT");
*/

import java.util.function.Predicate;

public class Task1 {

    public static void main(String[] args) {

        Employee emp1 =
                new Employee(101,"Joseph",
                        60000,"IT");

        Employee emp2 =
                new Employee(102,"David",
                        35000,"HR");

        Predicate<Employee> highSalary =
                emp -> emp.getSalary() > 50000;

        Predicate<Employee> itDepartment =
                emp -> emp.getDepartment()
                        .equalsIgnoreCase("IT");

        System.out.println(
                highSalary.test(emp1));

        System.out.println(
                highSalary.test(emp2));

        System.out.println(
                itDepartment.test(emp1));

        System.out.println(
                itDepartment.test(emp2));
    }
}