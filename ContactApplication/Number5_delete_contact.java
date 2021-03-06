package ContactApplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class ContactDelC {
    String name;
    String phone;
    String email;

    public ContactDelC (String name, String phone, String email) { 
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public ContactDelC (){
    }
}
public class Number5_delete_contact {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String delete_name = scanner.nextLine();
        String line;

        String input;
        
        LinkedList<ContactDelC > contacts = new LinkedList<ContactDelC >();
        
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            ContactDelC con = new ContactDelC(parts[0], parts[1], parts[2]);
            contacts.add(con);
        }
        
        for(int i = 0; i<contacts.size();i++){
            if (contacts.get(i).name.equals(delete_name)){
                System.out.println("---------------------");
                System.out.println("PHONE : " + contacts.get(i).phone);
                System.out.println("Email : " + contacts.get(i).email);
                System.out.println("---------------------");
                System.out.println("Are you sure? [Y]ES | [N]O: y");
                input = scanner.nextLine();
                if (input.equals("y")){
                contacts.remove(contacts.get(i));
                System.out.println("---------------------");
                System.out.println("Message: Contact deleted successfully");
                }
                else{
                    System.out.println("Not Deleted.");
                }
            }   
        }
        FileWriter writer = new FileWriter(file);
        for(int i = 0; i<contacts.size();i++){
                // System.out.print(contacts.get(i).name + "\t");
                // System.out.print(contacts.get(i).phone + "\t");
                // System.out.println(contacts.get(i).email);
                writer.write(contacts.get(i).name + ",");
                writer.write(contacts.get(i).phone + ",");
                writer.write(contacts.get(i).email + "\n");
        }   
        
        reader.close();
        scanner.close();
        writer.close();
    }
}
