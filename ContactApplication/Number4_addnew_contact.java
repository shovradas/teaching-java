package ContactApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class ContactAddC {
    String name;
    String phone;
    String email;

    public ContactAddC(String name, String phone, String email) { 
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public ContactAddC(){
    }
}
public class Number4_addnew_contact {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter writer = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);
        
        String line;
        String name = " ";
        String phone = " ";
        String email = " ";

        LinkedList<ContactSC> contacts = new LinkedList<ContactSC>();
        //System.out.println( "Name" + "\t" + "Phone" + "\t\t" + "Email");
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            ContactSC con = new ContactSC(parts[0], parts[1], parts[2]);
            contacts.add(con);
        }
        
        for(int i = 0; i<contacts.size();i++) {
            System.out.println("Enter contact name");
            name = scanner.nextLine();
            if (contacts.get(i).name.contains(name)){
                System.out.println("Enter unique name please. ");
                break;
            }  
            else{
                writer.write("\n" + name);
            }
            
            
            System.out.println("Enter contact phone");
            phone = scanner.nextLine();
            if (contacts.get(i).phone.contains(phone)){
                System.out.println("Enter unique phone please. ");
                break;
            }  
            else{
                writer.write("," + phone);
                // if(phone.startsWith("+880")){
                // }
            }


            System.out.println("Enter contact email");
            email = scanner.nextLine();
            if (contacts.get(i).email.contains(email)){
                System.out.println("Enter unique email please. ");
                break;
            }  
            else{
                writer.write("," + email);
                break;
            }
        }
        ContactSC con1 = new ContactSC(name,phone, email);
        contacts.add(con1);
        System.out.println("----------------");

        reader.close();
        scanner.close();
        writer.close();
    }
}
