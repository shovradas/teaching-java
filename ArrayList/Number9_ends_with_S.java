package ArrayList;

import java.util.ArrayList;

public class Number9_ends_with_S {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student student0 = new Student();
        student0.id = 1;
        student0.name = "john";
        student0.cgpa = 3.21f;
        student0.department = "English";
        student0.email = "j@gmail.com";
        students.add(student0);

        Student student1 = new Student();
        student1.id = 5;
        student1.name = "Hohn";
        student1.cgpa = 2.20f;
        student1.department = "Bangla";
        student1.email = "g@gmail.com";
        students.add(student1);

        Student student2 = new Student();
        student2.id = 7;
        student2.name = "jemmy";
        student2.cgpa = 3.33f;
        student2.department = "History";
        student2.email = "jm@gmail.com";
        students.add(student2);

        Student student3 = new Student();
        student3.id = 10;
        student3.name = "bob";
        student3.cgpa = 2.60f;
        student3.department = "CSE";
        student3.email = "b@gmail.com";
        students.add(student3);

        int index = -1;
        String ends = "S";
        for (int i = 0; i < students.size(); ++i) {
            if (ends.charAt(0) == students.get(i).name.charAt((students.get(i).name.length()) - 1)) {
                index = i;
                System.out.println(students.get(index).id);
                System.out.println(students.get(index).name);
                System.out.println(students.get(index).cgpa);
                System.out.println(students.get(index).department);
                System.out.println(students.get(index).email);
            }
        }
        if (index == -1) {
            System.out.println("No such student exists");
        }
    }
}
