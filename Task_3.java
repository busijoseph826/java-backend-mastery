class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        super(message);
    }
}

class StudentService {

    private int[] studentIds = {101, 102, 103, 104};

    public void findStudentById(int id) throws StudentNotFoundException {

        for (int studentId : studentIds) {
            if (studentId == id) {
                System.out.println("Student found with ID: " + id);
                return;
            }
        }

        throw new StudentNotFoundException(
                "Student with ID " + id + " not found.");
    }
}

public class Task_3 {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        try {
            service.findStudentById(102);
            service.findStudentById(200);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}