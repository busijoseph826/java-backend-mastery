import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDirectory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> employees = new HashMap<>();

        while (true) {
            System.out.println("\n===== Employee Directory =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int addId = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String addName = sc.next();

                    if (employees.containsKey(addId)) {
                        System.out.println("Employee ID already exists.");
                    } else {
                        employees.put(addId, addName);
                        System.out.println("Employee added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    if (employees.containsKey(searchId)) {
                        System.out.println("Employee Found:");
                        System.out.println("ID: " + searchId);
                        System.out.println("Name: " + employees.get(searchId));
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();

                    if (employees.containsKey(removeId)) {
                        employees.remove(removeId);
                        System.out.println("Employee removed successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    if (employees.isEmpty()) {
                        System.out.println("No employees available.");
                    } else {
                        System.out.println("Employee Directory:");
                        for (Integer id : employees.keySet()) {
                            System.out.println("ID: " + id + " | Name: " + employees.get(id));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}