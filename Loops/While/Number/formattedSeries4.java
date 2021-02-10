package Loops.While.Number;


import java.util.Scanner;

//Write a program to print the formatted Series: N, …., 16, 8, 4, 2, 1
public class formattedSeries4 {
    public static void main(String[] args) {
        int i = 1;
        //int sum = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();
        //int n = 32;
        while (i<=n){
            n = n/2;
            System.out.println(n);
            i++;
        }
    }
}

//last output is 4 ?