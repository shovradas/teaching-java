package Loops.While;

// Write a program to check a number whether it is perfect or not
public class perfect1 {
    public static void main(String[] args) {

        // positive number
        int number = 6;
        // loop runs from 1 to given number
        int i = 1;
        int sum = 0;
        while (i < number) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.println(" " + i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println("sum is : " + sum);

        if (sum == number) {
            System.out.println("perfect");
        } else {
            System.out.println("not perfect");
        }
    }
}
