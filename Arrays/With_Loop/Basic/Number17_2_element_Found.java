package Arrays.With_Loop.Basic;

//Write a program that takes two elements as inputs and searches them in a given array. If both of them are found then print their indexes. If none of them were found then print "not found". If one of them could not be found then print which of them could not be found.
import java.util.Scanner;

public class Number17_2_element_Found {
    public static void main(String[] args) {
        int[] a = new int[] { 5, 10, 15, 20, 20, 30 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = scanner.nextInt();
        System.out.print("Enter 2nd number : ");
        int m = scanner.nextInt();
        scanner.close();
        int i;
        int n_index = -1;
        int m_index = -1;

        for (i = 0; i < a.length; i++) {
            if (n == a[i]) {
                n_index = i;
                System.out.println(n_index);
                break;
            }
        }
        // ------------------m--------------------------
        for (i = 0; i < a.length; i++) {
            if (m == a[i]) {
                m_index = i;
                System.out.println(m_index);
                break;
            }
        }
        if (n_index == -1 && m_index == -1) {
            System.out.println("not found");
        }
        // ------------------any one found------------------
        for (i = 0; i < a.length; i++) {
            if ((n == a[i])) { 
                System.out.println(m + "is not found");
            }
            if (m == a[i]) {
                System.out.println(m + "is not found");
            }
        }
    }
}
