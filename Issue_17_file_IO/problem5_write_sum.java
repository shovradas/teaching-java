package Issue_17_file_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class problem5_write_sum {
    
    public static void main(String[] args) throws IOException {
        File file = new File("pairs5.txt");
        Scanner scanner = new Scanner(System.in);
        int num;
        int n = 3;
        int sum = 0;
        while (n > 0) {
             num = scanner.nextInt();
            sum += num;
            FileWriter writer = new FileWriter(file, true);
            writer.write(Integer.toString(sum));
            writer.write("\n");
            writer.close();
            n--;
        }

    }
}

