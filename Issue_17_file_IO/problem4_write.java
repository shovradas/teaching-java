package Issue_17_file_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class problem4_write {
    public static void main(String[] args) throws IOException {
        File file = new File("numbers4.txt");
        Scanner scanner = new Scanner(System.in);
        int num;
        int n = 3;
        while (n > 0) {
            FileWriter writer = new FileWriter(file, true);
            writer.write(Integer.toString(num = scanner.nextInt()));
            writer.write("\n");
            writer.close();
            n--;
        }

    }
}
