package Universitysystem;

public class Student  {

    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
    this.name = name;
    this.age =age;
    this.course = course;
    }

    
    public void displayStudent() {
        System.out.println("\n---Student details---");
        System.out.println("name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course"+course);
    }

}
