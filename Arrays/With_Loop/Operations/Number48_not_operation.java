package Arrays.With_Loop.Operations;
//Write a program that will perform NOT operations on a given boolean array.
public class Number48_not_operation {
    public static void main(String[] args) {
        boolean[] a = new boolean[] { true, false, true, true, false };

        for(int i = 0; i<a.length; i++){
            a[i]=!a[i];
            System.out.println(a[i]);
        }
        // a[0]=!a[0];
        // a[1]=!a[1];
        // a[2]=!a[2];
        // a[3]=!a[3];
        // a[4]=!a[4];
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);
    }
}
