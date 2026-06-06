/*Task 1: Box<T>

A generic class that can store any type of object.*/

class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class Task1 {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Joseph");

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(100);

        Box<Employee> employeeBox = new Box<>();
        employeeBox.setValue(new Employee(101, "John"));

        System.out.println(stringBox.getValue());
        System.out.println(integerBox.getValue());
        System.out.println(employeeBox.getValue());
    }
}