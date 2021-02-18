package Arrays.Loop;

//Write a program to print all the elements of a given array with an odd index
public class number8_print_all_element_where_index_number_odd {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 25, 30, 45, 55 };

        int i = a.length + 1; // a.lenth = 5+1 so that i > 0. otherwise 0,2,4 all would be counted as even
                              // whereas 0 should be treated as 1 which is a odd number.
        if ((i - 1) % 2 != 0) { System.out.println("1st index : " + a[i - 2]);} // now i-1=5
        if ((i - 2) % 2 != 0) { System.out.println("2nd index : " + a[i - 3]);} // now i-2=4
        if ((i - 3) % 2 != 0) { System.out.println("3rd index : " + a[i - 4]);} // now i-3=3
        if ((i - 4) % 2 != 0) { System.out.println("4th index : " + a[i - 5]);} // now i-4=2
        if ((i - 5) % 2 != 0) { System.out.println("5th index : " + a[i - 6]);} // now i-5=1

/************ */
        // for(int i = 0; i<=a.length;i++){
        // // if (i%2 !=0){
        // // System.out.println("Element1 : " + a[i]);
        // // }
        // }
    }
}
