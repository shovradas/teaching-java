package Arrays.With_Loop.Basic;

public class Number28_min_pos {
    public static void main(String[] args) {
        int[] a = new int[] { -5, 10, -15, -20, 25, 30 };
        int min_pos = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (min_pos > a[i]){
                    min_pos=a[i];
                }
            }
        }
        System.out.println("min positive : " + min_pos);
    }
}
