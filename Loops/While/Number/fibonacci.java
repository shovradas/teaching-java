package Loops.While.Number;

//Write a program to print the Fibonacci Series: 1, 1, 2, 3, 5, 8, …., N
//The Fibonacci series is a series where the next term is the sum of the previous two terms. 
public class fibonacci {
    public static void main(String[] args) {

        int i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2; //sum = 0+1 = 1, so t1 = 0, t2 = 1, t3 = 0+1 = 1, t4 = 1+1 = 2, t5 = 2+1 = 3, t6 = 2+3 = 5......
            t1 = t2;            
            t2 = sum;

            i++;
        }
    }
}