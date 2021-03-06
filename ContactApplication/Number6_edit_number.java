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
            ContactModC con = new ContactModC(parts[0], parts[1], parts[2]);
            contacts.add(con);
        }
        
        for(int i = 0; i<contacts.size();i++){
            if (contacts.get(i).name.equals(new_name)){
                System.out.println("---------------------");
                System.out.println("PHONE : " + contacts.get(i).phone);
                System.out.println("Email : " + contacts.get(i).email);
                System.out.println("---------------------");
                
                System.out.print("Enter a new phone or press Enter to skip: ");
                new_phone = scanner.nextLine();
                
                for(ContactModC myObj : contacts) { //object is iterating. //https://stackoverflow.com/questions/54511107/how-to-get-the-index-of-object-by-its-property-in-java-list?fbclid=IwAR1qTO-xj7nkw3VioVu-0WHvnJZG_w4Ty8mxT1iZsTDp_mVcpyWl72Jj1DE
                    if(new_name.equals(myObj.name)){
                        myObj.phone=new_phone;
                        break;
                    }
                    //pos++;
                }
                //System.out.println(pos);
                System.out.print("Enter a new phone or press Enter to skip: ");
                new_email = scanner.nextLine();
                
                for(ContactModC myObj : contacts) { //object is iterating. //https://stackoverflow.com/questions/54511107/how-to-get-the-index-of-object-by-its-property-in-java-list?fbclid=IwAR1qTO-xj7nkw3VioVu-0WHvnJZG_w4Ty8mxT1iZsTDp_mVcpyWl72Jj1DE
                    if(new_name.equals(myObj.name)){
                        myObj.email=new_email;
                        break;
                    }
                }
                System.out.println("---------------------");
            }
            else{
                System.out.println("Message: Contact updated successfully");
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

