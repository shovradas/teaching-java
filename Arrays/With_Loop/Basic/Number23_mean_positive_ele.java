package Arrays.With_Loop.Basic;
//Write a program to print the mean/average of all the positive elements of a given numeric array
public class Number23_mean_positive_ele {
    public static void main(String[] args) {
        double[] a = new double[] { -5, 10, -15, -20, 25, 30 };
        double sum = 0;
        double count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum = sum + a[i];
                count = count + 1;
            }
        }
        System.out.println(sum/count);
        // if (a[0] > 0) {
        //     sum = sum + a[0];
        //     count = count + 1;
        // }
        // if (a[1] > 0) {
        //     sum = sum + a[1];
        //     count = count + 1;
        // }
        // if (a[2] > 0) {
        //     sum = sum + a[2];
        //     count = count + 1;
        // }
        // if (a[3] > 0) {
        //     sum = sum + a[3];
        //     count = count + 1;
        // }
        // if (a[4] > 0) {
        //     sum = sum + a[4];
        //     count = count + 1;
        // }
        // if (a[5] > 0) {
        //     sum = sum + a[5];
        //     count = count + 1;
        // }
        
    }
}
