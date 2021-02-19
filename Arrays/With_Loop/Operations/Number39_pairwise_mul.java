package Arrays.With_Loop.Operations;
//Write a program to print the pair-wise multiplication of two given arrays A & B.
public class Number39_pairwise_mul {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        int[] b = new int[]{10, 20, 30, 4, 5};
        
        for(int i = 0; i<a.length; i++){
            System.out.println (a[i]*b[i]);
        }

        // System.out.println(a[0]*b[0]);
        // System.out.println(a[1]*b[1]);
        // System.out.println(a[2]*b[2]);
        // System.out.println(a[3]*b[3]);
        // System.out.println(a[4]*b[4]);
    }
}
