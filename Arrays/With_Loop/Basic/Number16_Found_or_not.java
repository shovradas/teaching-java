package Arrays.With_Loop.Basic;

import java.util.Scanner;

//Write a program that takes an element (ex: a number) as input and searches it in a given array. If found then print the index otherwise print "not found".
public class Number16_Found_or_not {
public static void main(String[] args) {
    int[] a = new int[]{ 5, 10, 15, 20, 25, 30};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = scanner.nextInt();
    scanner.close();
    //int i = a.length;
    for(int i = 0; i<a.length; i++){
        if(n!=a[i]){
        }
        else {System.out.println("index : " + i);}; 
    }
    
    // if (n==a[0]){ System.out.println("index : " +0);}
    // if (n==a[1]){ System.out.println("index : " +1);}
    // if (n==a[2]){ System.out.println("index : " +2);}
    // if (n==a[3]){ System.out.println("index : " +3);}
    // if (n==a[4]){ System.out.println("index : " +4);}
    // if (n==a[5]){ System.out.println("index : " +5);}
    // else{ System.out.println("not found");}
    }
}
