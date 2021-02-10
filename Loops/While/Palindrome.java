package Loops.While;

import java.util.Scanner;

//Write a program to find if a given number is palindromic or not.
// je pas theke e sonkha likhi na kno man same hobe 91019
public class Palindrome {
    public static void main(String[] args) {
            int num = 121, mirror_Num = 0;
            int original = num;
            while (num > 0) {
                int digit = num % 10; 
                mirror_Num = mirror_Num * 10 + digit;
                num =num / 10;
            }
            System.out.println("Mirror Number: " + mirror_Num);

            if (original == mirror_Num){
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not Palindrome");
            }
        }
    }