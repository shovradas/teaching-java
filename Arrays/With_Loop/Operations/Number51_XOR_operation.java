package Arrays.With_Loop.Operations;
//Write a program that will perform element-wise XOR operations for two given boolean arrays of the same length.
public class Number51_XOR_operation {
    public static void main(String[] args) {
        boolean[] a = new boolean[] { false, false, true, true};
        boolean[] b = new boolean[] { false, true, false, true};
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i] ^ b[i]);
        }

        // System.out.println (a[0] ^= b[0]);
        // System.out.println (a[1] ^= b[1]);
        // System.out.println (a[2] ^= b[2]);
        // System.out.println (a[3] ^= b[3]);
    }
}
