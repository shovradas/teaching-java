package Arrays.Without_Loop.Operations;
//Write a program that will copy an array A to another array B of the same length.
public class Number41_copy_array {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        int b[] = new int[a.length];
        b = a;

        System.out.print("{"+b[0]+ ",");
        System.out.print(b[1]+ ",");
        System.out.print(b[2]+ ",");
        System.out.print(b[3]+ ",");
        System.out.println(b[4]+ "}");
    }
}