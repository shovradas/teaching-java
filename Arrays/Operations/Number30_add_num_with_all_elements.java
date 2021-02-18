package Arrays.Operations;

import java.util.Scanner;
//Write a program to add a number N with all the elements of a given integer array. Print the array after add.
public class Number30_add_num_with_all_elements {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N : ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print("{" + (a[0] + n) +",");
        System.out.print((a[1] + n) +",");
        System.out.print((a[2] + n) +",");
        System.out.print((a[3] + n) +",");
        System.out.println((a[4] + n) + "}");
    }
}
