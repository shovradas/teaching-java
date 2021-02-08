package Method.Object;

public class Course {
    String name;
    int unitCode;
    String department;
    int durationInMonths;
    double fees;
    boolean havePlacement;
}

class programC {
    static void set(Course course, String name, int unitCode, String department, int durationInMonths, double fees,
            boolean havePlacement) {
        course.name = name;
        course.unitCode = unitCode;
        course.department = department;
        course.durationInMonths = durationInMonths;
        course.fees = fees;
        course.havePlacement = havePlacement;
    }

    static void print(Course course) {
        System.out.println(course.name);
        System.out.println(course.unitCode);
        System.out.println(course.department);
        System.out.println(course.durationInMonths);
        System.out.println(course.fees);
        System.out.println(course.havePlacement);
    }

    public static void main(String[] args) {

        Course course1 = new Course();
        set(course1, "Java", 502, "ICT", 4, 1200.50, true);
        print(course1);

        Course course2 = new Course();
        set(course2, "c#", 503, "ICT", 5, 1250.50, true);
        print(course2);
    }
}
