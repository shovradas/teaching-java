package ArrayList;

import java.util.ArrayList;

//Write a program to find the student having id=1 from a given Student array. Print the student details if found. Print "Could not be found" if the student is not found.
class Student1 {
    int id;
    String name;
    float cgpa;
    String department;
    String email;
}

public class Number2_find_strudent_ID {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student student0 = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        students.add(student0);
        student0.id = 1;
        student0.name = "john";
        student0.cgpa = 3.21f;
        student0.department = "English";
        student0.email = "j@gmail.com";

        students.add(student1);
        student1.id = 5;
        student1.name = "Hohn";
        student1.cgpa = 2.20f;
        student1.department = "Bangla";
        student1.email = "g@gmail.com";

        students.add(student2);
        student2.id = 7;
        student2.name = "jemmy";
        student2.cgpa = 3.33f;
        student2.department = "History";
        student2.email = "jm@gmail.com";

        students.add(student3);
        student3.id = 10;
        student3.name = "bob";
        student3.cgpa = 2.60f;
        student3.department = "CSE";
        student3.email = "b@gmail.com";

        int index = -1;
        for (int i = 0; i < students.size(); ++i) {
            if (students.get(i).id == 1) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Could not be found");
        } else {
            System.out.println(students.get(index).id);
            System.out.println(students.get(index).name);
            System.out.println(students.get(index).cgpa);
            System.out.println(students.get(index).department);
            System.out.println(students.get(index).email);
        }
    }
}
