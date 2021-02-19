package Arrays.Without_Loop.Basic;
//Write a program to print elements of the first half of a given array in ascending order and the second half in descending order by index. The given array should contain an even number of elements.
public class Number7_ascending_descending {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6};
        int b[]= new int[a.length];
        b[0]=a[0];
        b[1]=a[1];
        b[2]=a[2];
        
        b[5] = a[3];
        b[4] = a[4];
        b[3] = a[5];
       
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);
    }
}
