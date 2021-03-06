package ContactApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


class ContactAC {
    String name;
    String phone;
    String email;

    public ContactAC(String name, String phone, String email) { //constractor -> object er initializer hisebe kaj kore
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
public class Number1_view_All_Contact {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        int count = 0;

        LinkedList<ContactAC> contacts = new LinkedList<ContactAC>();

        System.out.println( "Name" + "\t" + "Phone" + "\t\t" + "Email");
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            ContactAC con = new ContactAC(parts[0], parts[1], parts[2]);
            contacts.add(con);
            //split the line
            //name, phone, email
            //print them in a formatted way
            count++;
        }
        for(int i = 0; i<contacts.size();i++){
            System.out.print(contacts.get(i).name + "\t");
            System.out.print(contacts.get(i).phone + "\t");
            System.out.print(contacts.get(i).email + "\n");
        }
        System.out.println("----------------");
        System.out.println("total "+count + " records");
        reader.close();
        
    }
}
