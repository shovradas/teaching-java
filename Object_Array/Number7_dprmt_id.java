package Object_Array;
//Write a program to print the department of the Student with id=1 from a given student array. Print "Student does not exist" if the student is not found.

class Student {
    int id;
    String name;
    float cgpa;
    String department;
    String email;
}
public class Number7_dprmt_id {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        students[3] = new Student();

        //students[0].id = 2;
        students[0].id = 1;
        students[0].name = "John";
        students[0].cgpa = 3.30f;
        students[0].department = "Bangla";
        students[0].email = "j@gmail.com";

        students[1].id = 3;
        students[1].name = "Bob";
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
        for (int i = 0; i < students.length; ++i) {
            if (students[i].id==1)
            {
                index = i;
                System.out.println(students[index].department);
            }
        }
        if (index == -1) {
                System.out.println("Student does not exist");
        }
    }
}

