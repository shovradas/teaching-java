package Arrays.Without_Loop.Basic;

public class Number29_max_neg {
    public static void main(String[] args) {
        int[] a = new int[] { -5, 10, -15, -20, 25, 30 };
        int max_neg  = 0;

        if (a[0] < 0) {
            //System.out.println(a[0]);
            max_neg=a[0];
        }
        if (a[1] < 0) {
            //System.out.println(a[1]);
            if (max_neg < a[1]){
                max_neg=a[1];
            }
        }
        if (a[2] < 0) {
            //System.out.println(a[1]);
            if (max_neg < a[2]){
                max_neg=a[2];
            }
        }
        if (a[3] < 0) {
            //System.out.println(a[1]);
            if (max_neg < a[3]){
                max_neg=a[3];
            }
        }
        if (a[4] < 0) {
            //System.out.println(a[1]);
            if (max_neg < a[4]){
                max_neg=a[4];
            }
        }
        if (a[5] < 0) {
            //System.out.println(a[1]);
            if (max_neg < a[5]){
                max_neg=a[5];
            }
        }
        System.out.println("min positive : " + max_neg);
    }
}
