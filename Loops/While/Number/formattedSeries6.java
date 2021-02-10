package Loops.While.Number;


import java.util.Scanner;

//Write a program to print the formatted Series: N, …., 1000, 100, 10, 1
public class formattedSeries6 {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n's value");
        int n = scanner.nextInt();
        scanner.close();

        while(i<=7){
            n=n/10;
            System.out.println(n);
            i++;
        }
    }
}
