package ContactApplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class ContactModC {
    String name;
    String phone;
    String email;

    public ContactModC (String name, String phone, String email) { 
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public ContactModC(){
    }
}

public class Number6_edit_number {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        
        String line;

        String new_name = scanner.nextLine();
        String new_phone;
        String new_email;

        LinkedList<ContactModC > contacts = new LinkedList<ContactModC>();
        
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            String phone=parts[1];
            String email=parts[2];
            ContactModC con = new ContactModC(name, phone, email);
            contacts.add(con);
        }
        
        for(int i = 0; i<contacts.size();i++){
            ContactModC contact = contacts.get(i);
            if (contact.name.equals(new_name)){
                System.out.println("---------------------");
                System.out.println("PHONE : " + contact.phone);
                System.out.println("Email : " + contact.email);
                System.out.println("---------------------");
                
                System.out.print("Enter a new phone or press Enter to skip: ");
                new_phone = scanner.nextLine();
                if(new_phone==""){
                contact.phone = contact.phone;
                }
                else{ contact.phone = new_phone;}

                System.out.print("Enter a new phone or press Enter to skip: ");
                new_email = scanner.nextLine();
                if(new_email == ""){
                contact.email=contact.email;
                }
                else{ contact.email=new_email;}

                System.out.println("Message: Contact updated successfully");
            } 
        }
        FileWriter writer = new FileWriter(file);
        for(int i = 0; i<contacts.size();i++){
                writer.write(contacts.get(i).name + ",");
                writer.write(contacts.get(i).phone + ",");
                writer.write(contacts.get(i).email + "\n");
        }   
        reader.close();
        writer.close();
    }
}

