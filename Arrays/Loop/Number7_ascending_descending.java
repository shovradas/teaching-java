package Arrays.Loop;
//Write a program to print elements of the first half of a given array in ascending order and the second half in descending order by index. The given array should contain an even number of elements.
public class Number7_ascending_descending {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6};
        int max = a[0];
        if (max< a[1]) { max=a[1];}
        if (max< a[2]) { max=a[2];}
        //if (max< a[3]) { max=a[3];}

        // if (max< a[1]) { max=a[1];}
        // if (max< a[1]) { max=a[1];}
        // if (max< a[1]) { max=a[1];}
        System.out.println(max);
    }
}
