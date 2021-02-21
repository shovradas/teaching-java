package Arrays.With_Loop.Basic;

//Write a program to print all the elements of a given array with an even index
public class number9_print_all_element_where_index_number_even {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 25, 30, 45, 55 };
        for (int i = 0; i <= a.length; i++) {
            if (i % 2 == 0) {
                System.out.println("index" + i + " : " + a[i]);
            }
        }


        // int i = a.length; // 
        // if ((i - 0) % 2 == 0) { System.out.println("index 0 : " + a[4]); } // now i-1=5
        // if ((i - 1) % 2 == 0) { System.out.println("index 1 : " + a[3]); } // now i-2=4
        // if ((i - 2) % 2 == 0) { System.out.println("index 2 : " + a[2]); } // now i-3=3
        // if ((i - 3) % 2 == 0) { System.out.println("index 3 : " + a[1]); } // now i-4=2
        // if ((i - 4) % 2 == 0) { System.out.println("index 4 : " + a[0]); } // now i-5=1
    }
}
