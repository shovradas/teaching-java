package Arrays.Without_Loop.Elementary;
//Write a program to print the second and second-last element of a given array
public class Number3_Second_and_second_Last {
    public static void main(String[] args) {
    int[] a = new int[]{7, 10 ,20, 30, 40};
        System.out.println("Second digit is : "+a[0+1]);
        System.out.println("Second last digit is : "+a[a.length-2]);
    }
}
