package Issue_17_file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class problem8 {
    public static void main(String[] args) throws IOException {
        File file = new File("input8.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine(); 
        
        String sum = null;       
        while(line !=null){      
            FileWriter writer = new FileWriter("output8.txt", true);    
            String[] parts = line.split(" ");
            // writer.write( parts [0] + ",");
            // writer.write(parts[1]);
            sum = (parts[0]) + " , "+(parts[1]);
            writer.write(sum);
            writer.write("\n");
            line = reader.readLine();
            writer.close();
        }
        reader.close();
    }
}
