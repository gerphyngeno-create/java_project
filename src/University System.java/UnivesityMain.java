package University system.java;

public class UnivesityMain {
    public static void main(String[] args) {


        Student s1 = new Student("Hope", 2000, "ST102", "Computer Science");
        Lecturer l1 = new Lecturer("Prof. Omondi", 45, "LF221", "Artificial Intelligence");
        Course c1 = new Course("Object Oriented Programming", "CSC201");

    
        s1.showInfo();
        s1.enrollCourse("CSC201");
        s1.payFees(15000);

        System.out.println();

        l1.showInfo();

        System.out.println();

        c1.showCourse();
    }
}
    
}
