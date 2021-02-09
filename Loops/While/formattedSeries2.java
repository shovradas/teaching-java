package Loops.While;

//Write a program to print the formatted series: N, …., 6, 5, 4, 3, 2, 1
import java.util.Scanner;
public class formattedSeries2{
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();
        while (i <= n) {
            System.out.println(n);
            n--;
        }
    }
}
