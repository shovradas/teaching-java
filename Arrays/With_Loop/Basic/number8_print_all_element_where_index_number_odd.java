package Arrays.With_Loop.Basic;

//Write a program to print all the elements of a given array with an odd index
public class number8_print_all_element_where_index_number_odd {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 25, 30, 45, 55 };

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                System.out.println("index" + i + " : " + a[i]);
            }
        }
          // int i = a.length;
        // if ((i - 0) % 2 != 0) { System.out.println("1st index : " + a[4]);} // now i-1=5
        // if ((i - 1) % 2 != 0) { System.out.println("2nd index : " + a[3]);} // now i-2=4
        // if ((i - 2) % 2 != 0) { System.out.println("3rd index : " + a[2]);} // now i-3=3
        // if ((i - 3) % 2 != 0) { System.out.println("4th index : " + a[1]);} // now i-4=2
        // if ((i - 4) % 2 != 0) { System.out.println("5th index : " + a[0]);} // now i-5=1     
    }
}
