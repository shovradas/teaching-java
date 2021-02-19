package Arrays.Without_Loop.Basic;

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
        int i = a.length;
        if ((n == a[0]) && (m == a[1])) {
            System.out.println("index " + ((i - 2) + " & index " + (i - 1)));
        }
        if ((n == a[1]) && (m == a[2])) {
            System.out.println("index " + ((i - 1) + " & index " + (i - 0)));
        }
        if ((n == a[2]) && (m == a[0])) {
            System.out.println("index " + ((i - 0) + " & index " + (i - 2)));
        }

        // System.out.println("-----If none of them were found then print not
        // found------");

        if (((n == a[0]) || (m == a[1])) || ((n == a[1]) || (m == a[2])) || ((n == a[2]) || (m == a[0]))) {
            // System.out.println(" found");
        } else {
            System.out.println("not found");
        }

        // System.out.println("Any one has found");

        if ((n == a[0]) || (m == a[1])) {
            if (n == a[0]) {
                System.out.println(m + "couldn't be found");
            } else {
                System.out.println(n + "couldn't be found");
            }
        }
        if ((n == a[1]) && (m == a[2])) {
            if (n == a[1]) {
                System.out.println(m + "couldn't be found");
            } else {
                System.out.println(n + "couldn't be found");
            }
        }
        if ((n == a[2]) && (m == a[0])) {
            if (n == a[0]) {
                System.out.println(m + "couldn't be found");
            } else {
                System.out.println(n + "couldn't be found");
            }
        }
    }
}
