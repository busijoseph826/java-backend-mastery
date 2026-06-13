/*
Practical Exercise 3
Consumer<Employee>

Consumer means:

Input  -> Employee
Output -> Nothing

Used when performing some action.
*/
/*
Print Employee

Consumer<Employee> printEmployee =
        emp -> System.out.println(emp);
*/

import java.util.function.Consumer;

public class Task3 {

    public static void main(String[] args) {

        Employee emp =
                new Employee(101,
                        "Joseph",
                        60000,
                        "IT");

        Consumer<Employee> printEmployee =
                employee -> System.out.println(employee);

        printEmployee.accept(emp);
    }
}