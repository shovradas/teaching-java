package ContactApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

class Student {
    String name;
    String phone;
    String email;
}

public class qqq {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();

        while(line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
            // LinkedList<Student> students = new LinkedList<Student>();
            // Student student0 = new Student();
            // student0.name = "john";
            // student0.phone = "English";
            // student0.email = "j@gmail.com";
            // students.add(student0);
            // for (int i = 0; i < students.size(); ++i) {
            //     System.out.println(students.get(i).name);
            //     System.out.println(students.get(i).email);
            //     System.out.println(students.get(i).email);
            //     System.out.println("----");
            // }

            reader.close();
        }
}
