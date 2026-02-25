package University system.java;

public class Student {
    public class Student extends Person implements Enrollable, Payable {

    private String program;

    public Student(String name, int id, String program) {
        super(name, id);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println(getName() + " enrolled in " + courseName);
    }

    @Override
    public void payFee(double amount) {
        System.out.println(getName() + " paid fee: " + amount);
    }

}
    
}
