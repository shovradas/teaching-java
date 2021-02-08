package Loops.While;
//Write a program that will find and print the count of numbers between 1 to 50 which are multiple of 7.
public class countMult7 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i<=50){
            if (i%7==0){
                count ++;
            }
            i++;
        } 
        System.out.println("total : " + count);
    }
}
