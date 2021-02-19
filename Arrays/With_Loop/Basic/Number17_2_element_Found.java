package Arrays.With_Loop.Basic;

//Write a program that takes two elements as inputs and searches them in a given array. If both of them are found then print their indexes. If none of them were found then print "not found". If one of them could not be found then print which of them could not be found.
import java.util.Scanner;

public class Number17_2_element_Found {
    public static void main(String[] args) {
        int[] a = new int[] { 5, 10, 15 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = scanner.nextInt();
        System.out.print("Enter 2nd number : ");
        int m = scanner.nextInt();
        scanner.close();
        //int i = a.length;
        for(int i=0; i<a.length; i++){
        if ((n == a[i]) && (m == a[i+1])) {
            System.out.println("index " + i + " & index " + (i+1));
        }
    }
        // System.out.println("-----If none of them were found then print not
        // found------");

        if (((n == a[0]) || (m == a[1])) || ((n == a[1]) || (m == a[2])) || ((n == a[2]) || (m == a[0]))) {
            // System.out.println(" found");
        } else {
            System.out.println("not found");
        }

        // System.out.println("Any one has found");

        for(int i=0; i<a.length; i++){
            if (n == a[i]) {
                System.out.println(m + "couldn't be found");
            } else{}
            if (m==a[i]) {
                System.out.println(n + "couldn't be found");
            }else{}
        }
        
    }}

