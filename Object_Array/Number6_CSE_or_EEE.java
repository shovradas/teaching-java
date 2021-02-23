package Object_Array;
//Write a program to find the students who study either under the "EEE" or "CSE" department. Student array is given. Print "No records available" if no student is found under any department.
class Student {
    int id;
    String name;
    float cgpa;
    String department;
    String email;
}
public class Number6_CSE_or_EEE {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        students[3] = new Student();

        students[0].id = 2;
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
            if ((students[i].department== "CSE" ) || (students[i].department== "EEE" )) {
                index = i;
                System.out.println(students[index].id);
                System.out.println(students[index].name);
                System.out.println(students[index].cgpa);
                System.out.println(students[index].department);
                System.out.println(students[index].email);
            }
        }
        if (index == -1) {
                System.out.println("No records available");
        }
    }
}
