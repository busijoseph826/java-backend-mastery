/*
Practical Exercise 4
Supplier<String>

Supplier means:

Input  -> Nothing
Output -> Something

Used when generating values.
*/

/*
Generate Random Employee ID

Supplier<String> employeeIdSupplier =
        () -> "EMP" +
              (int)(Math.random() * 10000);
*/

import java.util.function.Supplier;

public class Task4 {

    public static void main(String[] args) {

        Supplier<String> employeeIdSupplier =
                () -> "EMP" +
                        (int)(Math.random()*10000);

        System.out.println(
                employeeIdSupplier.get());

        System.out.println(
                employeeIdSupplier.get());

        System.out.println(
                employeeIdSupplier.get());
    }
}