package Arrays.With_Loop.Basic;
//Write a program to print the mean/average of all the elements of a given array
public class Number15_avg {
    public static void main(String[] args) {
        double[] a = new double[]{ 5, 10, 15, 20, 25, 30};
        double sum=0;
        for(int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }
        // sum = sum+a[0];
        // sum = sum + a[1];
        // sum = sum + a[2];
        // sum = sum + a[3];
        // sum = sum + a[4];
        // sum = sum + a[5];
        System.out.println(sum/a.length);
    } 
}
