package Loops.While.Number;

// Write a program that will find and print the count of odd numbers between 1 to 20.
public class findPrintOdd {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i <= 20) {
            if (i % 2 != 0) {
                count ++;
            }
            i++;
        }
        System.out.println("total odd : " + count);
    }
}
