import java.util.*;

public class StudentManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayAllStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Exiting the system. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        students.add(new Student(rollNumber, name, age, course));
        System.out.println("Student added successfully!");
    }

    static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displayDetails();
            }
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int rollNumber = scanner.nextInt();
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student Found:");
                student.displayDetails();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int rollNumber = scanner.nextInt();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getRollNumber() == rollNumber) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
