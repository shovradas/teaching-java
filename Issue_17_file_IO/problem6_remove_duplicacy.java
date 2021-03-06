package Issue_17_file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class problem6_remove_duplicacy {
    public static void main(String[] args) throws IOException {
        File file = new File("letters.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        StringBuilder line = new StringBuilder(reader.readLine());

        int i = 0;

        while (line != null) {
            FileWriter writer = new FileWriter(file, true);
            for (i = 0; i < line.length(); i++) {
                if (line.charAt(i) == line.charAt(i++)) {
                    writer.write(line.charAt(i++));
                    continue;
                }
            }
        }
    }
}

//read charecter not line -> 
