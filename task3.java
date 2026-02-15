class Course {
    String courseCode;
    String courseName;
    int creditHours;

    Course(String code, String name, int credits) {
        courseCode = code;
        courseName = name;
        creditHours = credits;
    }

    void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Programming Fundamentals", 3);
        Course c2 = new Course("CS201", "Object Oriented Programming", 4);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
