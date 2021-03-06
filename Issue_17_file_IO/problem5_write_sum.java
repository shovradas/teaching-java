package Issue_17_file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class problem5_write_sum {

    public static void main(String[] args) throws IOException {
        File file = new File("pairs5.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine(); 
        
        int sum = 0;       
        while(line !=null){      
            FileWriter writer = new FileWriter(file, true);    
            String[] parts = line.split(" ");
            writer.write( parts [0] + " + ");
            writer.write(parts[1] + " = ");
            sum = Integer.parseInt (parts[0]) + Integer.parseInt(parts[1]);
            writer.write(Integer.toString(sum));
            writer.write("\n");
            line = reader.readLine();
            writer.close();
        }
        reader.close();
    }
}
