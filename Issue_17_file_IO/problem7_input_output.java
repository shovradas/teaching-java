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
        String line = reader.readLine(); 
        int num;
        int sum = 0;       
        while(line !=null){      

            FileWriter writer = new FileWriter("output.txt", true);  
            num = Integer.parseInt(reader.readLine());  
            sum = sum + num;
            writer.write(Integer.toString(sum));
            writer.write("\n");
            writer.close();
        }
        reader.close();
    }
}
