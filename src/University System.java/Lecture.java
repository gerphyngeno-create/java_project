package University system.java;

public class Lecture {public class Lecturer extends Staff {
    private String specialization;

    public Lecturer(String name, int age, String staffId, String specialization) {
        super(name, age, staffId);
        this.specialization = specialization;
    }

    @Override
    public void showInfo() {
        System.out.println("Lecturer: " + getName() + ", Staff ID: " + getStaffId() + ",
         Specialization: " + specialization);
    }
}

    
}
