UNIVERSITY SYSTEM PROJECT REPORT

Introduction

The University System is a Java-based application developed to manage student information. The system allows users to input student details and store multiple records dynamically. It provides a simple interface for adding and viewing student data.

This project was developed to demonstrate the use of Object-Oriented Programming (OOP) concepts and exception handling in Java.

---

The main objectives of this project are:

- To implement a menu-driven Java application
- To allow dynamic user input using Scanner
- To apply exception handling techniques
- To improve program reliability and prevent crashes
- To demonstrate OOP principles such as classes and objects

---

System Description

The system is a console-based application that allows users to interact through a menu. The available options are:

1. Add Student
2. View Students
3. Exit

Users can input student details including name, age, and course. The system stores the data in memory and allows users to view all entered records.

---

Technologies Used

- Programming Language: Java
- Tools: Any Java IDE (e.g., IntelliJ IDEA, NetBeans, or VS Code)

---

Key Features

- Menu-driven interface
- Dynamic user input
- Storage of multiple student records using ArrayList
- Input validation for correct data
- Exception handling for error management

---

 System Design

Classes Used

- Student Class
  Stores student details such as name, age, and course.

- UniversitySystem Class
  Contains the main method and controls the program flow.

- InvalidInputException Class
  A custom exception used to handle invalid input such as incorrect age or menu choice.

---

 Exception Handling

 InvalidInputException

This is a user-defined exception used to handle:

- Age less than or equal to zero
- Invalid menu options

 InputMismatchException

This exception handles cases where the user enters the wrong data type, such as entering text instead of a number.

 Finally Block

The finally block ensures that a message is displayed after every operation, whether an error occurs or not.

---

8 Program Flow

1. The program displays a menu to the user
2. The user selects an option
3. The system processes the input using try-catch
4. If the input is valid, the student is added or displayed
5. If an error occurs, it is handled and a message is shown
6. The program continues running until the user chooses to exit

---

 OOP Concepts Applied

- Classes and Objects: Used to model student data
- Encapsulation: Data is stored in private variables
- Exception Handling: try, catch, and finally blocks used
- Abstraction: Only necessary details are shown to the user

---

 Testing and Results

The program was tested with different inputs:

- Valid inputs successfully added students
- Invalid age triggered custom exception
- Wrong data type triggered InputMismatchException

The system handled all errors correctly without crashing.

---

 Conclusion

The project successfully demonstrates how Java can be used to create a simple and reliable system. The use of exception handling ensures that the program can handle errors gracefully, making it more robust and user-friendly.

---

 Recommendations

Future improvements may include:

- Adding a database for permanent data storage
- Developing a graphical user interface (GUI)
- Including lecturer and course management features

---

 Author

Name: Gerphy Ngeno
Course: Diploma in Information Technology
Unit: Object-Oriented Programming
