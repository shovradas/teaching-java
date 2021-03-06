package ContactApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Contact1 {
    String name;
    String phone;
    String email;

    public Contact1(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class feature25_addnew_contact {

//     public static void addContact() throws IOException {
//         File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.txt");
//         FileWriter writer = new FileWriter(file, true);
//         Scanner scanner = new Scanner(System.in);
//         List<Contact> contacts = new LinkedList<Contact>();
//         Contact contact = new Contact();
//         System.out.print("Enter contact name : " + "\n");
//         contact.name = scanner.nextLine();
//         System.out.print("Enter contact phone : " + "\n");
//         contact.phone = scanner.nextLine();
//         System.out.print("Enter contact email : " + "\n");
//         contact.email = scanner.nextLine();
//         //contacts.add(contact0);
//         writer.write("NAME  " + "Phone  " + "EMAIL " + "\n");
//         for (Contact c : contacts) {
//             writer.write(c.name + "\t" + c.phone + "\t" + c.email);
//         }
//         writer.close();
//         scanner.close();
//     }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File file = new
        File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileWriter writer = new FileWriter(file, true);

        List<Contact> contacts = new LinkedList<Contact>();

        Contact contact0 = new Contact(null, null, null);
        System.out.print("Enter contact name : " + "\n");
        contact0.name = scanner.nextLine();
        System.out.print("Enter contact phone : " + "\n");
        contact0.phone = scanner.nextLine();
        System.out.print("Enter contact email : " + "\n");
        contact0.email = scanner.nextLine();
        contacts.add(contact0);

        writer.write("NAME " + "Phone " + "EMAIL " + "\n");
        //for (Contact contact : contacts) {
        writer.write(contact0.name +"\t" + contact0.phone + "\t" + contact0.email + "\n");
        writer.write("\n");
        //}
        writer.close();
        scanner.close();

        //Contact contact0;
        // Contact contact0 = new Contact();
        // addContact();
        // contacts.add(contact0);
    }
}

