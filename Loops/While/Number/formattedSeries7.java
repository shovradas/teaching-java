package Loops.While.Number;

//Write a program to print the formatted Series: 1, 3, 5, 7, 16, …., N
import java.util.Scanner;

public class formattedSeries7 {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n's value");
        int n = scanner.nextInt();
        scanner.close();
        int l = 10;

        while(i <=l){
            System.out.println(n);
            n=n+2;
            i++;
        }
    }
}
