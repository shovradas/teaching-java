package Arrays.Loop;

import java.util.Scanner;

//Write a program that takes an element (ex: a number) as input and searches it in a given array. If found then print the index otherwise print "not found".
public class Number16_Found_or_not {
public static void main(String[] args) {
    int[] a = new int[]{ 5, 10, 15, 20, 25, 30};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = scanner.nextInt();
    scanner.close();
    int i = a.length;
    if (n==a[0]){ System.out.println("index : " +(i-5));}
    if (n==a[1]){ System.out.println("index : " +(i-4));}
    if (n==a[2]){ System.out.println("index : " +(i-3));}
    if (n==a[3]){ System.out.println("index : " +(i-2));}
    if (n==a[4]){ System.out.println("index : " +(i-1));}
    if (n==a[5]){ System.out.println("index : " +(i-0));}
    else{ System.out.println("not found");}
    }
}
