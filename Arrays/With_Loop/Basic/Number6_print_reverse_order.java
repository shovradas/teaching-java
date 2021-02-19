package Arrays.With_Loop.Basic;

public class Number6_print_reverse_order {
    public static void main(String[] args) {
        int[] a = new int[]{10, 25, 30, 45, 55};
        for(int i=a.length-1; i > 0; i--){
            System.out.println("Element" + i + " :" + a[i] + "");
        }


        // System.out.println(a[a.length-1]);
        // System.out.println(a[a.length-2]);
        // System.out.println(a[a.length-3]);
        // System.out.println(a[a.length-4]);
        // System.out.println(a[a.length-5]);
    }
}
