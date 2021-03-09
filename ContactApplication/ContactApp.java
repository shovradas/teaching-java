package ContactApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class ContactApp {
    File file = new File("ContactApplication/All_contact.csv");
    Scanner scanner = new Scanner(System.in);

    LinkedList<Contact> getContacts(File file) throws IOException{
        String line;
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        LinkedList<Contact > contacts = new LinkedList<Contact >();
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            String phone=parts[1];
            String email=parts[2];
            Contact con = new Contact(name, phone, email);
            contacts.add(con);
        }
        reader.close();
        return contacts;
    }
    
    void print(File file, LinkedList<Contact> contacts) throws Exception{
        String line;
        for(int i = 0; i<contacts.size();i++){
            Contact contact = contacts.get(i);
            line =  contact.name + "\t" +  contact.phone + "\t"+ contact.email;
            System.out.println(line);
        }
    }
    
    void viewAll() throws Exception {
        LinkedList<Contact> contacts = getContacts(file);
        System.out.println("Name" + "\t" + "Phone" + "\t\t" + "Email");

        print(file, contacts);
        System.out.println("----------------");
        System.out.println("total " + contacts.size() + " records");
    }

    void viewDetail() throws IOException {
        LinkedList<Contact> contacts = getContacts(file);
        System.out.print("Enter name: ");
        String search_name = scanner.next();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equals(search_name)) {
                System.out.println("----------------");
                System.out.println("PHONE : " + contacts.get(i).phone);
                System.out.println("EMAIL : " + contacts.get(i).email);
            }
        }
    }

    void searchContact() throws IOException{
        LinkedList<Contact> contacts = getContacts(file);
        System.out.print("Enter search keyword: ");
        String search_term = scanner.nextLine();
        System.out.println("----------------");
        int count = 0;

        System.out.println( "Name" + "\t" + "Phone" + "\t\t" + "Email");
        
        for(int i = 0; i<contacts.size();i++){
            Contact contact = contacts.get(i);
            if ((contact.name.contains(search_term))||(contact.phone.contains(search_term))||(contact.email.contains(search_term))){
                String line;
                line =  contact.name + "\t" +  contact.phone + "\t"+ contact.email;
                System.out.println(line);
                count++;
            }   
        }
        System.out.println("----------------");
        System.out.println(count + " Records found");
    }
    
    void addContact() throws IOException{
        LinkedList<Contact> contacts = getContacts(file);
        FileWriter writer = new FileWriter(file, true);
        
        String name = " ";
        String phone = " ";
        String email = " ";

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
            String line;
            line = "\n"+name;

            if ((phone.startsWith("+")) || (phone.startsWith("00"))) {
                line = line + phone;
            } else {
                line = line + "," + "+88"+phone;
            }

            line = line + "," + email;
            writer.write(line);
        }
    
        writer.close();
    }
   
    void save(File file, LinkedList<Contact> contacts) throws Exception{
        String line;
        FileWriter writer = new FileWriter(file);
        for(int i = 0; i<contacts.size();i++){
            Contact contact = contacts.get(i);
            line = String.format("%s,%s,%s\n", contact.name, contact.phone, contact.email);
            writer.write(line);
        }
        writer.close();
    }

    void removeContact() throws Exception{
        LinkedList<Contact> contacts = getContacts(file);
        System.out.print("Enter name: ");
        String delete_name = scanner.nextLine();
        String input;
        
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

        save(file, contacts);
    }
 
    void editContact() throws Exception{
        LinkedList<Contact> contacts = getContacts(file);
        System.out.print("Enter name: ");

        String new_name = scanner.nextLine();
        String new_phone;
        String new_email;

        for(int i = 0; i<contacts.size();i++){
            Contact contact = contacts.get(i);
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

        save(file, contacts);
    }
    public static void main(String[] args) throws Exception {
        ContactApp app = new ContactApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Contact app.");
        while (true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("[V]IEW-ALL • [S]EARCH • [D]ETAILS • [A]DD • [E]DIT • [R]EMOVE • [Q]UIT: ");
            System.out.println("----------------------------------------------------------------------");
        
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
