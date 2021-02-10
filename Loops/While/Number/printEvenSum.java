package Loops.While.Number;

//Write a program that will find and print the summation of all the even numbers between 60 to 90.
public class printEvenSum {
    public static void main(String[] args) {
        int i = 60;
        int sum = 0;
        while(i<=90){
            if (i%2 == 0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
    
}
