package Issue_17_file_IO;

import java.io.BufferedReader;

//Read the numbers from the file line by line and print the sum of each pair in the console

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class problem2_sum {
    public static void main(String[] args) throws IOException {
        File file = new File("pairs.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine(); 
        int sum = 0;       
        while(line !=null){          
            String[] parts = line.split(" ");
            System.out.print( parts [0] + " + ");
            System.out.print(parts[1] + " = ");
            sum = Integer.parseInt (parts[0]) + Integer.parseInt(parts[1]);
            System.out.println(sum);
            line = reader.readLine();
        }
    }
}