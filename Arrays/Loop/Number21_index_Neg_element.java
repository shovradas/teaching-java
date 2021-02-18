package Arrays.Loop;
//Write a program to print the indexes of all the negative elements of a given array
public class Number21_index_Neg_element {
    public static void main(String[] args) {
        int[] a = new int[] { -5, 10, -15, -20, 25, 30 };
        int i = a.length;
        if(a[0] < 0){ System.out.println("Index"+(i-6));}
        if(a[1] < 0){ System.out.println("Index"+(i-5));}
        if(a[2] < 0){ System.out.println("Index"+(i-4));}
        if(a[3] < 0){ System.out.println("Index"+(i-3));}
        if(a[4] < 0){ System.out.println("Index"+(i-2));}
        if(a[5] < 0){ System.out.println("Index"+(i-1));}
    }
}
