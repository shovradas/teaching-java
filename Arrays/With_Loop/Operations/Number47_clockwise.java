package Arrays.With_Loop.Operations;

//Write a program that will rotate an integer array A clockwise once.

public class Number47_clockwise {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5};
        //int b[] = new int[a.length];
        int x = a[a.length-1];
        for (int i = a.length-1; i>=1; i--){
            a[i]=a[i-1]; //a[3] = a[2]
            System.out.println(a[i]);
        }
        a[0]=x;
        System.out.println(a[0]);

        // a[3] = a[2];
        // System.out.println(a[3]);
        // a[2] = a[1];
        // System.out.println(a[3]);
        // a[1] = a[0];
        // System.out.println(a[3]);
        // a[0] = x;
        // System.out.println(a[3]);
    }
}
