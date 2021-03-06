package Issue_17_file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.Scanner;

//Read the numbers from the file line by line and print them in the console
public class problem1_read_number {
    public static void main(String[] args) throws IOException {

        File file = new File("numbers.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine(); 
        //int data;
        while(line!=null){
        
            System.out.println(line);
            line = reader.readLine(); 
        }
    }
}
