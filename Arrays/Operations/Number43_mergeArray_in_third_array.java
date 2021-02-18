package Arrays.Operations;
//Write a program that merges two arrays A, B into a third array C. Hints: C.length = A.length+B.length
public class Number43_mergeArray_in_third_array {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 15};
        int[] b = new int[]{10, 20, 30};
        int c[] = new int[ a.length+b.length];

        System.out.println(c.length);
        c[0] =  a[0];
        c[1] =  b[0];
        c[2] =  a[1];
        c[3] =  b[1];
        c[4] =  a[2];
        c[5] =  b[2];

        System.out.print("{"+c[0]+ ",");
        System.out.print(c[1]+ ",");
        System.out.print(c[2]+ ",");
        System.out.print(c[3]+ ",");
        System.out.print(c[4]+ ",");
        System.out.println(c[5]+ "}");
    }
}
