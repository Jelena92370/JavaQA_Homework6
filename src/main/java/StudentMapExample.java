import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMapExample {

    public static void main(String[] args) {


        Map<Integer, Student> studentsMap = new HashMap<>();


        for (int i = 1; i <= 10; i++) {
            Student student = new Student("FirstName " + i, "LastName " + i, 19 + i, 3.5 + i, i);
            studentsMap.put(i, student);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Information about all students = 1");
            System.out.println("Information about one student = 2");
            System.out.println("Please choose 1 or 2:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayAllStudents(studentsMap);
                    break;
                case 2:
                    displayOneStudent(studentsMap, scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
            System.out.println("Would you like to continue? (yes/no)");
            scanner.nextLine();
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }

        }

        scanner.close();
    }

    private static void displayAllStudents(Map<Integer, Student> studentsMap) {
        System.out.println("List of all students:");
        for (Student student : studentsMap.values()) {
            System.out.println(student);
        }
    }

    private static void displayOneStudent(Map<Integer, Student> studentsMap, Scanner scanner) {
        System.out.println("Enter the unique identifier of the student:");
        int uniqueIdentifier = scanner.nextInt();

        Student student = studentsMap.get(uniqueIdentifier);
        if (student != null) {
            System.out.println("Student information:");
            System.out.println(student);
        } else {
            System.out.println("Can not find any student with such identifier.");
        }
    }
    }






