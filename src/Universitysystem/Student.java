package Universitysystem;

class Student  {

    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
    this.name = name;
    this.age =age;
    this.course = course;
    }

    public String toFileString() {
        return name +"," + age + "," + course;
    }
    public static Student fromFileString(String
         line){
            String[] parts = line.split(",");
            return new Student (parts[0],
            Integer.parseInt(parts[1]), parts[2]);
         }

    
    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:"+ age);
        System.out.println("Course:"+ course);
        System.out.println("----------------");
    
    }

}
