package ContactApplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class ContactSC {
    String name;
    String phone;
    String email;

    public ContactSC(String name, String phone, String email) { 
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
public class Number3_Serach_Contact {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String search_name = scanner.nextLine();
        System.out.println("----------------");
        String line;
        int count = 0;

        LinkedList<ContactSC> contacts = new LinkedList<ContactSC>();
        System.out.println( "Name" + "\t" + "Phone" + "\t\t" + "Email");
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            ContactSC con = new ContactSC(parts[0], parts[1], parts[2]);
            contacts.add(con);
        }
        
        for(int i = 0; i<contacts.size();i++){
            if (contacts.get(i).name.contains(search_name)){
                System.out.print(contacts.get(i).name + "\t");
                System.out.print(contacts.get(i).phone + "\t");
                System.out.println(contacts.get(i).email);
                count++;
            }   
        }
        System.out.println("----------------");
        System.out.println(count + " Records found");

        reader.close();
        scanner.close();
        
    }
}
