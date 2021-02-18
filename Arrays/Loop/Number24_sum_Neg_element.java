package Arrays.Loop;
//Write a program to print the summation of all the negative elements of a given numeric array
public class Number24_sum_Neg_element {
    public static void main(String[] args) {
        int[] a = new int[] { -5, 10, -15, -20, 25, 30 };
        int sum = 0;
        if(a[0] < 0){ sum = sum + a[0];}
        if(a[1] < 0){ sum = sum + a[1];}
        if(a[2] < 0){ sum = sum + a[2];}
        if(a[3] < 0){ sum = sum + a[3];}
        if(a[4] < 0){ sum = sum + a[4];}
        if(a[5] < 0){ sum = sum + a[5];}
        System.out.println(sum);
    }
}
