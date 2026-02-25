package University system.java;

public class Course {
    public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void showCourse() {
        System.out.println("Course: " + courseName + " (" + courseCode + ")");
    }
}
    
}
