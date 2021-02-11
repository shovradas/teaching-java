package Loops.While.Number;

import java.util.Scanner;

//import java.util.Scanner;

//Write a program to print the formatted Series: N, …., 16, 8, 4, 2, 1
public class formattedSeries4 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 64;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();
        while (i<=n){
            System.out.println(sum);
            sum = sum/2;
            
            i++;
        }
    }
}

