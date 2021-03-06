package ContactApplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class ContactVD {
    String name;
    String phone;
    String email;

    public ContactVD(String name, String phone, String email) { 
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
public class Number2_View_Detail {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/farzanaprity/Workspace/teaching-java/ContactApplication/All_contact.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String search_name = scanner.nextLine();
        String line;

        LinkedList<ContactVD> contacts = new LinkedList<ContactVD>();

        //System.out.println( "Name" + "\t" + "Phone" + "\t" + "Email");
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            ContactVD con = new ContactVD(parts[0], parts[1], parts[2]);
            contacts.add(con);
        }
        for(int i = 0; i<contacts.size();i++){
            if (contacts.get(i).name.equals(search_name)){
                System.out.println("----------------");
                System.out.println("PHONE : "+contacts.get(i).phone);
                System.out.println("EMAIL : "+contacts.get(i).email);
            }
        }
        reader.close();
        scanner.close();
        
    }
}
