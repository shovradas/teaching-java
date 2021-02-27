package Issue_17_file_IO;

import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;
import java.util.Scanner;

//Read the numbers from the file line by line and print them in the console
public class problem1_read_number {
    public static void main(String[] args) throws IOException {
        File file = new File("numbers.txt");
        //int data;
        Scanner scanner = new Scanner(file);
        int x = scanner.nextInt();
        int z = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        System.out.println(x + " " + y + " " + z);
    }
}
