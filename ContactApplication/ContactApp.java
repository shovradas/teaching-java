package ContactApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class ContactApp {
    void viewAll() throws IOException {
        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        int count = 0;

        LinkedList<Contact> contacts = new LinkedList<Contact>();

        System.out.println("Name" + "\t" + "Phone" + "\t\t" + "Email");
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            Contact con = new Contact(parts[0], parts[1], parts[2]);
            contacts.add(con);
            // split the line
            // name, phone, email
            // print them in a formatted way
            count++;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.print(contacts.get(i).name + "\t");
            System.out.print(contacts.get(i).phone + "\t");
            System.out.print(contacts.get(i).email + "\n");
        }
        System.out.println("----------------");
        System.out.println("total " + count + " records");
        reader.close();
    }

    void viewDetail() throws IOException {
        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String search_name = scanner.next();
        //scanner.nextLine();
        String line;

        LinkedList<Contact> contacts = new LinkedList<Contact>();

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            Contact con = new Contact(parts[0], parts[1], parts[2]);
            contacts.add(con);
        }
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equals(search_name)) {
                System.out.println("----------------");
                System.out.println("PHONE : " + contacts.get(i).phone);
                System.out.println("EMAIL : " + contacts.get(i).email);
            }
        }
        reader.close();
    }

    void searchContact() throws IOException{
        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search keyword: ");
        String search_term = scanner.nextLine();
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
            if ((contacts.get(i).name.contains(search_term))||(contacts.get(i).phone.contains(search_term))||(contacts.get(i).email.contains(search_term))){
                System.out.print(contacts.get(i).name + "\t");
                System.out.print(contacts.get(i).phone + "\t");
                System.out.println(contacts.get(i).email);
                count++;
            }   
            //phone r email sob e check korbe -> ja die khuje pabe tar sob detail dekhabe. if er moddhe duita ||
        }
        System.out.println("----------------");
        System.out.println(count + " Records found");

        reader.close();
    }
    
    void addContact() throws IOException{
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
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            ContactSC con = new ContactSC(parts[0], parts[1], parts[2]);
            contacts.add(con);
        }

        System.out.println("Enter contact name");
        name = scanner.nextLine();
        System.out.println("Enter contact phone");
        phone = scanner.nextLine();
        System.out.println("Enter contact email");
        email = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equals(name)) {
                index = i;
                System.out.println("Plese Enter an unique name. ");
                break;
            }
            if (contacts.get(i).phone.equals(phone)) {
                index = i;
                System.out.println("Plese Enter an unique phone. ");
                break;
            }

            if (contacts.get(i).email.equals(email)) {
                System.out.println("Please Enter unique email. ");
                break;
            }
        }
        if (index == -1) {
            writer.write("\n" + name);

            if ((phone.startsWith("+")) || (phone.startsWith("00"))) {
                writer.write("," + phone);
            } else {
                writer.write("," + "+88" + phone);
            }

            writer.write("," + email);
        }
        ContactSC con1 = new ContactSC(name, phone, email);
        contacts.add(con1);

        reader.close();
        writer.close();
    }
    
    void removeContact() throws IOException{
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
                writer.write(contacts.get(i).name + ",");
                writer.write(contacts.get(i).phone + ",");
                writer.write(contacts.get(i).email + "\n");
        }   
        
        reader.close();
        writer.close();
    }
 
    void editContact() throws IOException{
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
    public static void main(String[] args) throws IOException {
        ContactApp app = new ContactApp();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to Contact app.");
            System.out.println("Choices are ");
            System.out.println("For viewing all contact [V]IEW-ALL : V|v");
            System.out.println("For searching contact [S]EARCH : S|s");
            System.out.println("For detail of a specific contact [D]ETAILS : D|d");
            System.out.println("For adding contact [A]DD : A|a");
            System.out.println("For editing contact [E]DIT : E|e");
            System.out.println("For removing contact [R]EMOVE : R|r");
            System.out.println("For quiting from the app [Q]UIT : Q|q");

            //[V]IEW-ALL • [S]EARCH • [D]ETAILS • [A]DD • [E]DIT • [R]EMOVE • [Q]UIT:  v
            System.out.print("Enter a choice : ");
            char choice = scanner.next().charAt(0);
            if ((choice == 'V') || (choice == 'v')){
                app.viewAll();
            }
            else if((choice == 'S')||(choice == 's')){
                app.searchContact();
            }
            else if ((choice == 'D')||(choice == 'd')) {
                app.viewDetail();
            }
            else if ((choice == 'A') || (choice == 'a')){
                app.addContact();;
            }
            else if ((choice == 'E')||(choice == 'e')) {
                app.editContact();
            }
            else if ((choice == 'R') || (choice == 'r')) {
                app.removeContact();
            }
            else if((choice == 'Q')||(choice == 'q')){
                break;
            }
            else{
                break;
            }
        }
        scanner.close();
    }
}

// throws , static function
