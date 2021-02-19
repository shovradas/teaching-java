package Arrays.With_Loop.Basic;
//Write a program to print the summation of all the elements of a given array
public class Number14_sum {
    public static void main(String[] args) {
        int[] a = new int[]{ 5, 10, 15, 20, 25, 30};
        int sum=0;
        for(int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }
        // sum = sum+a[0];
        // sum = sum + a[1];
        // sum = sum + a[2];
        // sum = sum + a[3];
        // sum = sum + a[4];
        // sum = sum + a[5];
        System.out.println(sum);
    }
}
