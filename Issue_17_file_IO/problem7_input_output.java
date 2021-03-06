package Issue_17_file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class problem7_input_output {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        
        int sum = 0;
        int num = 0;
        String line = reader.readLine();
        while (line != null) {
            num =  Integer.parseInt(line.trim());
            sum = sum+num;
            line = reader.readLine(); 
        }
        reader.close();
        FileWriter writer = new FileWriter("output.txt");   
        writer.write("sum = " + sum);
        writer.close();
    }
}

