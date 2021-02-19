package Arrays.Without_Loop.Basic;
//Write a program to print the minimum number of a given integer array
public class Number26_min_element {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5, 10, 15};
        
        int min=a[0];
        if(min>a[1]){ min = a[1];}
        if(min>a[2]){ min = a[2];}
        if(min>a[3]){ min = a[3];}
        if(min>a[4]){ min = a[4];}
        if(min>a[5]){ min = a[5];}
        System.out.println(min);
    }
}
