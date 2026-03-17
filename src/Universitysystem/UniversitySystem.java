package Universitysystem;

import java.util.*;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

     while (true) {
     try {
            
   System.out.println("\n===== UNIVERSITY SYSTEM =====");
   System.out.println("1. Add Student");
   System.out.println("2. View Students");
   System.out.println("3. Exit");
   System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();
    scanner.nextLine(); 

    switch (choice) {

    case 1:
                    
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    scanner.nextLine();

                    
    if (age <= 0) {
    throw new InvalidInputException("Age must be greater than 0.");
                        }

    System.out.print("Enter course: ");
    String course = scanner.nextLine();

                    
    Student student = new Student(name, age, course);
    students.add(student);

    System.out.println("Student added successfully!");
    break;

    case 2:
        
    if (students.isEmpty()) {
    System.out.println("No students found.");
    } else {
    // for (Student : students) {
    // student.displayStudent();
    // }
    }
    break;

    case 3:
            
    System.out.println("Exiting program...");
    scanner.close();
    System.exit(0);
    break;

    default:
    throw new InvalidInputException("Invalid menu choice!");
    }

    } catch (InvalidInputException e) {
    System.out.println("Error: " + e.getMessage());

    } catch (InputMismatchException e) {
    System.out.println("Error: Please enter correct data type.");
    scanner.nextLine();

    } finally {
    System.out.println("Operation completed.");
    }
    }
    }
}