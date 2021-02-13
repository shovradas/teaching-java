package Loops.While.Number;

//Write a program to print the formatted Series: 1 1, 2 2, 3 4, 4 8, 5 16, 6 32, …., N M
import java.util.Scanner;

public class formattedSeries12 {
    public static void main(String[] args) {
        int i = 1;
        int y = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter loop limit : ");
        int n = scanner.nextInt();
        scanner.close();
        while (i <= n) {
            int x = i;
            System.out.print(x + "" + y);
            y = y * 2;
            if (i < n) {
                System.out.print(",");
            }
            // System.out.println(y);

            i++;
        }
    }
}
