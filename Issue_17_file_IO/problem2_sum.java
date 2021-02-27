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

        String line = reader.readLine(); //****** one of the way
        int sum = 0;
        while(line != null){
        //System.out.println(line);
        line = reader.readLine();
        sum +=Integer.parseInt(line);
        System.out.println(sum);
        }
        
        // int data;
        // while((data = fileReader.read()) != -1){
        //     System.out.print((char) data);
        // }

        

    }
}