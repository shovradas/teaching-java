package Loops.While;

import java.util.Scanner;

//Write a program to find and print the factorial of a given number.
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the number : ");
        int num = scanner.nextInt();
        scanner.close();
        long factorial = 1;
        int i = 1; 
        while (i<=num){
            // factorial = factorial * i; //10*9*8*7*6*5*4*3*2*1
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of " + num + " is " + factorial);
    }
}
