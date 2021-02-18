package Arrays.Operations;

import java.util.Scanner;

//Write a program to divide all the elements of a given integer array by a number N. Print the array after division.
public class Number34_div_num_with_all_ele {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N : ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print("{" + (a[0] / n) +",");
        System.out.print((a[1] / n) +",");
        System.out.print((a[2] / n) +",");
        System.out.print((a[3] / n) +",");
        System.out.println((a[4] / n) + "}");
    }
}

