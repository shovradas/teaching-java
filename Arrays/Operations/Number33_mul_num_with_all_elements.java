package Arrays.Operations;
//Write a program to multiply a number N with all the elements of a given integer array. Print the array after multiplication.
import java.util.Scanner;

public class Number33_mul_num_with_all_elements {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N : ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print("{" + (a[0] * n) +",");
        System.out.print((a[1] * n) +",");
        System.out.print((a[2] * n) +",");
        System.out.print((a[3] * n) +",");
        System.out.println((a[4] * n) + "}");
    }
}


