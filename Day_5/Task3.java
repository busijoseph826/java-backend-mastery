import java.util.Arrays;
import java.util.List;

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

class GenericPrinter {

    public static void print(List<?> items) {

        for (Object item : items) {
            System.out.println(item);
        }

        System.out.println("----------------");
    }
}

public class Task3 {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Joseph", "John", "David");

        List<Integer> numbers =
                Arrays.asList(10, 20, 30);

        List<Employee> employees =
                Arrays.asList(
                        new Employee(101, "Joseph"),
                        new Employee(102, "John")
                );

        GenericPrinter.print(names);
        GenericPrinter.print(numbers);
        GenericPrinter.print(employees);
    }
}