package Loops.While.Number;

//Write a program that will find and print the summation of all the odd numbers between 10 to 50.
public class printOddSum {
    public static void main(String[] args) {
        int i = 10;
        int sum = 0;
        while(i<=50){
            if(i%2 != 0){
                sum = i + sum;
            }
            i++;
        }
        System.out.println("Total all odd : " + sum);
    }
}
