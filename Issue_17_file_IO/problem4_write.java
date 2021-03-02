package Issue_17_file_IO;
//Write a program that will take N numbers as input from the console and store them in a file called numbers.txt. Each number should be stored in separate lines.

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
        //int sum = 0;
        while (n > 0) {
            FileWriter writer = new FileWriter(file, true);
            num = scanner.nextInt();
            writer.write(Integer.toString(num = scanner.nextInt()));
            //sum = sum+num;
            writer.write("\n");
            writer.write(Integer.toString(num));
            writer.close();
            n--;
        }

    }
}
