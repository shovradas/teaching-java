package Arrays.Without_Loop.Operations;

import java.util.Scanner;

//Write a program to divide all the elements of a given integer array by a number N. Print the array after division.
public class Number34_div_num_with_all_ele {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N : ");
        int n = scanner.nextInt();
        scanner.close();

        a[0]=a[0] / n;
        a[1]=a[1] / n;
        a[2]=a[2] / n;
        a[3]=a[3] / n;
        a[4]=a[4] / n;

        System.out.print("{" + a[0] +",");
        System.out.print(a[1] +",");
        System.out.print(a[2] +",");
        System.out.print(a[3] +",");
        System.out.println(a[4] + "}");
    }
}

