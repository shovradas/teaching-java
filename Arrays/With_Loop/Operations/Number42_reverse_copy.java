package Arrays.With_Loop.Operations;
//Write a program that will copy an array A to another array B of the same length in reverse order (by index).
public class Number42_reverse_copy {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        int b[] = new int[a.length];
        
        for(int i = 0; i<a.length; i++){
            b[i]=a[a.length - (i+1)]; 
            System.out.println(b[i]);
        }
        // b[0] = a[4];
        // b[1] = a[3];
        // b[2] = a[2];
        // b[3] = a[1];
        // b[4] = a[0];
        // System.out.print("{"+b[0]+ ",");
        // System.out.print(b[1]+ ",");
        // System.out.print(b[2]+ ",");
        // System.out.print(b[3]+ ",");
        // System.out.println(b[4]+ "}");
    }
}
