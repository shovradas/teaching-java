package Loops.While.Number;


import java.util.Scanner;

//Write a program that will take the N number of digits as input and construct the number out of those digits. Print the constructed number.
public class constructedNum {
    public static void main(String[] args) {
        int i = 1;
        
        Scanner sc = new Scanner(System.in);
        while(i<=7){
        System.out.println("Enter digits : " );
        int number = sc.nextInt();
        sc.close();
        i++;    

    int reminder;
         int count = 0;
         int temp = number;
        // int i = 1;
         //int input = 7;

         while (number >= 0) {
             number = number * 10; // reduce the number or discard the last digits
             System.out.println(number);
             count--;
         } 
         while (temp > 0) {
             reminder = number + number;
             System.out.println(reminder);
             temp = temp * 10;
             count++;
         }
    }}
}