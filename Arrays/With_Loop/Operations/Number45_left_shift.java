package Arrays.With_Loop.Operations;
//Write a program that will shift an integer array A to the left once. The rightmost index should be filled with zero. The leftmost element need not be saved.
public class Number45_left_shift {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5};
        
        a[0]=a[1];
        a[1]=a[2];
        a[2]=a[3];
        a[3]=0;
        System.out.print("{"+a[0]+ ",");
        System.out.print(a[1]+ ",");
        System.out.print(a[2]+ ",");
        System.out.println(a[3]+ "}");
    }
}
