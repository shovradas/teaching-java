package Arrays.Without_Loop.IO;
//Write a program that will take N user inputs into an array. Print the array after all input is taken.
import java.util.Scanner;

public class Number52_input {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        a[0]=scanner.nextInt();
        a[1]=scanner.nextInt();
        a[2]=scanner.nextInt();
        a[3]=scanner.nextInt();
        a[4]=scanner.nextInt();
        scanner.close();

        System.out.print("{" + a[0]+",");
        System.out.print(a[1]+",");
        System.out.print(a[2]+",");
        System.out.print(a[3]+",");
        System.out.println(a[4]+"}");
    }
}
