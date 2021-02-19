package Arrays.With_Loop.Operations;

//Write a program that will rotate an integer array A clockwise once.

public class Number47_clockwise {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5};
        int b[] = new int[a.length];
        for (int i = 0; i<a.length-1; i++){
            b[i]=a[i+1];
            System.out.println(b[i]);
        }
        b[a.length-1] = a[0];
        System.out.println( b[a.length-1]);


        // b[0]=a[1];
        // b[1]=a[2];
        // b[2]=a[3];
        // b[3]=a[0];
        // System.out.print("{"+b[0]+ ",");
        // System.out.print(b[1]+ ",");
        // System.out.print(b[2]+ ",");
        // System.out.println(b[3]+ "}");
    }
}
