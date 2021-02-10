package Loops.While.Number;

//Write a program to print the formatted Series: 1, 2, 4, 8, 16, …., N

import java.util.Scanner;

public class formattedSeries3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();
        //int n = 10;
        while (i<=n){
            sum = sum*2;
            System.out.println(sum);
            i++;
        }
    }
}
