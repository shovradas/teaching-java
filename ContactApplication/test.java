package ContactApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Scanner;
// class Contact2 {
//     String name;
//     String phone;
//     String email;

//     public Contact2(String name, String phone, String email) {
//         this.name = name;
//         this.phone = phone;
//         this.email = email;
//     }
// }

public class test {
    public static void main(String[] args) throws IOException {
        LinkedList<String> list = new LinkedList<String>();
        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String searchName = scan.nextLine();

        while (line != null) {
            list.add(line);
            line = reader.readLine();
        }

        for (int i = 0; i < list.size(); i++) {
        //     System.out.println(line);

            if (line.contains(searchName)) {
                System.out.println(line);
                // String[] parts = line.split("\t");
                // name = parts[0];
                // System.out.println("NAME    :   " + name);
                // System.out.println("--------------");
                // phone = parts[1];
                // email = parts[2];
                // System.out.println("PHONE  :   " + phone + "\n" + "Email   :   " + email + "\n");
            }
        }

        reader.close();
    }
}
