package Arrays.With_Loop.Basic;
//Write a program to print all the negative elements of a given integer array
public class Number19_print_Neg_element {
    public static void main(String[] args) {
        int[] a = new int[] { -5, 10, -15, -20, 25, 30 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println(a[i]);
            }
        }
        // if (a[0]<0){System.out.println(a[0]);}
        // if (a[1]<0){System.out.println(a[1]);}
        // if (a[2]<0){System.out.println(a[2]);}
        // if (a[3]<0){System.out.println(a[3]);}
        // if (a[4]<0){System.out.println(a[4]);}
        // if (a[5]<0){System.out.println(a[5]);}
    }
}
