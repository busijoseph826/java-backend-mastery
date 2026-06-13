/*
Practical Exercise 2
Function<Employee,String>

Function is used when:

Input  -> Employee
Output -> String
*/

import java.util.function.Function;

public class Task2 {

    public static void main(String[] args) {

        Employee emp =
                new Employee(101,
                        "Joseph",
                        60000,
                        "IT");

        Function<Employee,String> getName =
                employee -> employee.getName();

        String name = getName.apply(emp);

        System.out.println(name);
    }
}