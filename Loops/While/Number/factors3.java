package Loops.While.Number;

// Write a program that will compute and print the sum of all the factors of a given number
public class factors3 {
    public static void main(String[] args) {

        // positive number
        int number = 60;

        
        // loop runs from 1 to 60
        int i = 1;
        int sum = 0;
        while (i <= number) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                //System.out.println(" " + i);
                sum = sum +i;
            }
            i++;
        }
        System.out.println("sum is : " + sum);
    }
}
