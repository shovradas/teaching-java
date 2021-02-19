package Arrays.With_Loop.Elementary;
//Write a program to print the first and last element of a given array
public class Number2_first_and_Last_digit {
    public static void main(String[] args) {
        int[] a = new int[]{7, 10 ,20, 30, 40};
        System.out.println("First digit is : "+a[0]);
        System.out.println("Last digit is : "+a[a.length-1]);
    }
}
