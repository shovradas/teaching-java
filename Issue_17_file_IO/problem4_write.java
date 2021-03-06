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
        FileWriter writer = new FileWriter(file, true);
        int num;
        int n = 3;
        //int sum = 0;
        for (int i =1; i<=n; i++){
            num = scanner.nextInt();
            writer.write(Integer.toString(num));
            writer.write("\n");
        }
        writer.close();
        scanner.close();
    }
}
