package Loops.While;
//Write a program to print the formatted series: 1, 2, 3, 4, 5, 6, …., N
import java.util.Scanner;

public class formattedSeries1 {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
    
}
