package Universitysystem;

import java.util.*;
import java.io.*;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class UniversitySystem {
    static final String FILE_NAME =
    "students.txt";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        loadFromFile(students);


     while (true) {
     try {
            
   System.out.println("\n===== UNIVERSITY SYSTEM =====");
   System.out.println("1. Add Student");
   System.out.println("2. View Students");
   System.out.println("3.Save to File");
   System.out.println("4.Load from File");
   System.out.println("5. Exit");
   System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();
    scanner.nextLine(); 

    switch (choice) {

    case 1:
                    
    System.out.print("Enter name: ");
    String name = scanner.nextLine();

    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    scanner.nextLine();

                    
    if (age <= 0) {
    throw new 
    InvalidInputException("Age must be greater than 0.");
                        }

    System.out.print("Enter course: ");
    String course = scanner.nextLine();

                    
    students.add (new Student(name, age, course));

    System.out.println("Student added successfully!");
    break;

    case 2:
        
    if (students.isEmpty()) {
    System.out.println("No students found.");
    } else {
     //for (Student s : students) {
     //s.display();
    // }
    }
    break;

    case 3:
        saveToFile(students);
        break;

    case 4:
        loadFromFile(students);
        break;

    case 5:
        saveToFile(students);
            
    System.out.println("Exiting program...");
    scanner.close();
    System.exit(0);
    break;

    default:
    throw new 
    InvalidInputException("Invalid choice!");
    }

    } 
    catch (InvalidInputException e) {
    System.out.println("Error: " + e.getMessage());

    } catch (InputMismatchException e) {
    System.out.println("Error: Please enter correct data type.");
    scanner.nextLine();

    } finally {
    System.out.println("Operation completed.");
    }
    }
    }

    // Save to file
    public static void 
    saveToFile(ArrayList<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                writer.write(s.toFileString());
                writer.newLine();
            }
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // Load from file
    public static void loadFromFile(ArrayList<Student> students) {
        students.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(Student.fromFileString(line));
            }
            System.out.println("Data loaded from file.");
        } catch (IOException e) {
            System.out.println("No file found, starting fresh.");
        }
    }
}
