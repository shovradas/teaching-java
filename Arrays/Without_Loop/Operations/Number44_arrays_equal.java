package Arrays.Without_Loop.Operations;
//Write a program that compares the equality of two integer arrays A & B. A & B are considered equal if both contain the same number of elements, and all corresponding pairs of elements are equal.
public class Number44_arrays_equal {
    public static void main(String[] args) {
        int[] a = new int[]{20, 25, 30, 5};
        //int[] b = new int[]{10, 20, 30, 4};
        int[] b = new int[]{20, 25, 30, 5};


        if (a.length==b.length){
            System.out.println(" Lenth equal ");

            if((a[0]==b[0]) && (a[1]==b[1]) && (a[0]==b[0]) && (a[0]==b[0])){
                System.out.println("Arrays A & B are equal.");
            }
            else{ System.out.println("Arrays A & B are not equal.");}
        }
    }
}
