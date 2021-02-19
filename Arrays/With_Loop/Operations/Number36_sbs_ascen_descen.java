package Arrays.With_Loop.Operations;
//Write a program to print all the elements of two given arrays A& B side by side. A should be printed in ascending order (by index). B should be printed in descending order (by index)
public class Number36_sbs_ascen_descen {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10};
        int[] b = new int[]{10, 20, 30, 40, 50};

        System.out.println(a[0]+" "+b[4]);
        System.out.println(a[1]+" "+b[3]);
        System.out.println(a[2]+" "+b[2]);
        System.out.println(a[3]+" "+b[1]);
        System.out.println(a[4]+" "+b[0]);
    }
}
