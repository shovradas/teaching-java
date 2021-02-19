package Arrays.Without_Loop.Basic;

public class Number28_min_pos {
    public static void main(String[] args) {
        int[] a = new int[] { -5, 10, -15, -20, 25, 30 };
        int min_pos  = 100;

        if (a[0] > 0) {
            //System.out.println(a[0]);
            min_pos=a[0];
        }
        if (a[1] > 0) {
            //System.out.println(a[1]);
            if (min_pos > a[1]){
                min_pos=a[1];
            }
        }
        if (a[2] > 0) {
            //System.out.println(a[1]);
            if (min_pos > a[2]){
                min_pos=a[2];
            }
        }
        if (a[3] > 0) {
            //System.out.println(a[1]);
            if (min_pos > a[3]){
                min_pos=a[3];
            }
        }
        if (a[4] > 0) {
            //System.out.println(a[1]);
            if (min_pos > a[4]){
                min_pos=a[4];
            }
        }
        if (a[5] > 0) {
            //System.out.println(a[1]);
            if (min_pos > a[5]){
                min_pos=a[5];
            }
        }
        System.out.println("min positive : " + min_pos);
    }
}
