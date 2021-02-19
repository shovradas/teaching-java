package Arrays.With_Loop.Basic;
//Write a program to print the indexes of all the odd elements of a given array
public class Number12_odd_element_index {
    public static void main(String[] args) {
        int[] a = new int[]{ 5, 10, 15, 20, 25, 30};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("Element" + i + " : " + a[i]);
            }
        }
        // int i = a.length;
        // if(a[0] % 2 !=0){ System.out.println("Index"+(i-6));}
        // if(a[1] % 2 !=0){ System.out.println("Index"+(i-5));}
        // if(a[2] % 2 !=0){ System.out.println("Index"+(i-4));}
        // if(a[3] % 2 !=0){ System.out.println("Index"+(i-3));}
        // if(a[4] % 2 !=0){ System.out.println("Index"+(i-2));}
        // if(a[5] % 2 !=0){ System.out.println("Index"+(i-1));}
    }
}
