package ContactApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) { //constractor -> object er initializer hisebe kaj kore
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class feature19_view_Detail {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter writer = new FileWriter(file, true);
        String line = reader.readLine();
        System.out.println(line);
        // Scanner scanner = new Scanner(System.in);
        // String searchName = scanner.nextLine();

        LinkedList contact = new LinkedList();

        // Contact parse(){
            
        // }

        // Contact contact0 = new Contact("bob", "1", "bob@gmail.com");
        // list.add(contact0);
        // writer.write(contact0.name + "\t" + contact0.phone + "\t" + contact0.email);
        // writer.write("\n");

        // Contact contact1 = new Contact("mob", "1", "mob@gmail.com");
        // list.add(contact1);
        // writer.write(contact1.name + "\t" + contact1.phone + "\t" + contact1.email);
        // writer.write("\n");

        // writer.close(); 

        while (line != null){
            System.out.println(line);
            contact.add(line);
            line = reader.readLine();
        }

        // for(int i = 0; i<contact.size(); i++){
        //     System.out.println(line);
        // }

        // for (Contact contact : list) {
        
        // }
        
        // for (Contact contact : list) {
        //     if (Contact.name.contains(searchName)) {
        //        // System.out.println(contact);
        //         System.out.println(Contact.name);
        //         //line = reader.readLine();
        //         System.out.println("--------------");
        //         System.out.println("PHONE : " + contact.phone + "\n" + "EMAIL : " + contact.email + "\n");
        //     }
        // }
        // reader.close();
        // scanner.close();
    }
}
