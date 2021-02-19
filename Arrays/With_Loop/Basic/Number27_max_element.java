package Arrays.With_Loop.Basic;

//Write a program to print the maximum number of a given integer array
public class Number27_max_element {
    public static void main(String[] args) {
        int[] a = new int[] { 20, 25, 30, 5, 10, 15 };

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(" max is : " + max);
        // if(max<a[2]){ max = a[2];}
        // if(max<a[3]){ max = a[3];}
        // if(max<a[4]){ max = a[4];}
        // if(max<a[5]){ max = a[5];}
        
    }
}
