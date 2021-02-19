package Arrays.With_Loop.IO;

import java.util.Scanner;

//Write a program that will take positive numbers as user inputs into an array. The program should stop taking input as soon as it gets a negative value. Print only the given inputs (not the whole array) after all inputs are taken.
public class Number53_positive_input {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        int previousInput = 0;
        System.out.println ("Enter values up to  100 values, " +
                "enter a negative number to quit");
        for (int i=0; i< a.length; i++)
        {
            a[i] = scanner.nextInt();
            if (a[i] < 0)
            {
                previousInput = i;
                break;
            }
        }
        System.out.println("inputs:");
        for (int i =0; i<previousInput; i++)
        {
            System.out.println(a[i]);
        }
    }
}
