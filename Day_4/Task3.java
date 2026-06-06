/*Task 3: Repository<T>

Create one generic interface and implement it for different entities*/

interface Repository<T> {

    void save(T obj);

    T findById(int id);
}

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

class EmployeeRepository implements Repository<Employee> {

    private Employee employee;

    @Override
    public void save(Employee employee) {
        this.employee = employee;
        System.out.println("Employee saved");
    }

    @Override
    public Employee findById(int id) {

        if (employee != null && employee.getId() == id) {
            return employee;
        }

        return null;
    }
}

class StudentRepository implements Repository<Student> {

    private Student student;

    @Override
    public void save(Student student) {
        this.student = student;
        System.out.println("Student saved");
    }

    @Override
    public Student findById(int id) {

        if (student != null && student.getId() == id) {
            return student;
        }

        return null;
    }
}

public class Task3 {

    public static void main(String[] args) {

        EmployeeRepository employeeRepo =
                new EmployeeRepository();

        employeeRepo.save(
                new Employee(101, "Joseph"));

        System.out.println(
                employeeRepo.findById(101));

        StudentRepository studentRepo =
                new StudentRepository();

        studentRepo.save(
                new Student(201, "John"));

        System.out.println(
                studentRepo.findById(201));
    }
}