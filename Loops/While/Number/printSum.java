package Loops.While.Number;

//Write a program that will find and print the summation of all the numbers between 1 to 20.
public class printSum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=20){
                sum = sum +i;
                i++;
        } 
        System.out.println("total : " + sum);
    }
}
