package Object_Array;
// Write a program to find students whose names end with "S" from a given student array. Print "No such student exists" if the student is not found.
class Student8 {
    int id;
    String name;
    float cgpa;
    String department;
    String email;
}
public class Number9_ends_with_S {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        students[3] = new Student();

        //students[0].id = 2;
        students[0].id = 1;
        //students[0].name = "JohS";
        students[0].name = "John";
        students[0].cgpa = 3.30f;
        students[0].department = "Bangla";
        students[0].email = "j@gmail.com";

        students[1].id = 3;
        students[1].name = "Bob";
        //students[1].name = "BoS";
        students[1].cgpa = 3.00f;
        students[1].department = "Math";
        students[1].email = "b@gmail.com";

        students[2].id = 4;
        students[2].name = "Alica";
        students[2].cgpa = 2.45f;
        students[2].department = "English";
        //students[2].department = "EEE";
        students[2].email = "a@gmail.com";

        students[3].id = 6;
        students[3].name = "Kat";
        students[3].cgpa = 2.33f;
        students[3].department = "History";
        //students[3].department = "CSE";
        students[3].email = "k@gmail.com";

        int index = -1;
        String ends = "S";
        for (int i = 0; i < students.length; ++i) {
            if (ends.charAt(0)==students[i].name.charAt((students[i].name.length())-1))
            {
                index =i;
            System.out.println(students[i].id);
            System.out.println(students[i].name);
            System.out.println(students[i].cgpa);
            System.out.println(students[i].department);
            System.out.println(students[i].email);
            }
        }
        if (index == -1) {
                System.out.println("No such student exists");
        }
    }
}
