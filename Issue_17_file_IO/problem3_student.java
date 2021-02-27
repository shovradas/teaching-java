package Issue_17_file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Read the records from the file, store them in a list. Print the list in the console

public class problem3_student {
    public static void main(String[] args) throws IOException {
        File file = new File("students.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine(); //****** one of the way
        while(line != null){
        // String[] parts = line.split(",");
        // System.out.println(parts[0]);
        // System.out.println(parts[1]);
        // System.out.println(parts[2]);
        line = line.replaceAll(",", " ");
        System.out.println(line);
        line = reader.readLine();

        }
    }
}
