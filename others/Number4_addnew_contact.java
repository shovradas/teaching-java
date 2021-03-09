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

        LinkedList<Contact> contacts = new LinkedList<Contact>();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            Contact con = new Contact(parts[0], parts[1], parts[2]);
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
        Contact con1 = new Contact(name, phone, email);
        contacts.add(con1);

        reader.close();
        writer.close();
    }
}
