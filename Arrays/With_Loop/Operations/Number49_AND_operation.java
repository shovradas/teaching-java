package Arrays.With_Loop.Operations;
//Write a program that will perform element-wise AND operations for two given boolean array of same length.
public class Number49_AND_operation {
    public static void main(String[] args) {
        boolean[] a = new boolean[] { true, false, true, true};
        boolean[] b = new boolean[] { true, true, false, false};
        int i;
        for( i = 0; i<a.length; i++){
            a[i]=a[i] & b[i];
            System.out.println(a[i]);
        }

        // System.out.println (a[0] && b[0]);
        // System.out.println (a[1] && b[1]);
        // System.out.println (a[2] && b[2]);
        // System.out.println (a[3] && b[3]);
    }
}
