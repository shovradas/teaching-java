package Arrays.Operations;
//Write a program that will shift an integer array A to the right once. The leftmost index should be filled with zero. The rightmost element need not be saved.
public class Number46_right_shift {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5}; //{0,20,25,30}
        int b[] = new int[a.length];
        b[0]=0;
        b[1]=a[0];
        b[2]=a[1];
        b[3]=a[2];

        System.out.print("{"+b[0]+ ",");
        System.out.print(b[1]+ ",");
        System.out.print(b[2]+ ",");
        System.out.println(b[3]+ "}");
    }
}
