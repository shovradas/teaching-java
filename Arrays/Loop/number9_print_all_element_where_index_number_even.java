package Arrays.Loop;

//Write a program to print all the elements of a given array with an even index
public class number9_print_all_element_where_index_number_even {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 25, 30, 45, 55 };

        int i = a.length + 1; // a.lenth = 5+6 so that i > 0. otherwise 0,2,4 all would be counted as even
                              // whereas 0 should be treated as 1 which is a odd number.
        if ((i - 1) % 2 == 0) { System.out.println("index 0 : " + a[i - 2]); } // now i-1=5
        if ((i - 2) % 2 == 0) { System.out.println("index 1 : " + a[i - 3]); } // now i-2=4
        if ((i - 3) % 2 == 0) { System.out.println("index 2 : " + a[i - 4]); } // now i-3=3
        if ((i - 4) % 2 == 0) { System.out.println("index 3 : " + a[i - 5]); } // now i-4=2
        if ((i - 5) % 2 == 0) { System.out.println("index 4 : " + a[i - 6]); } // now i-5=1
    }
}
