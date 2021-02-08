package Loops.While;
//Write a program that will count all the factors of a given number.
public class factors2 {
    public static void main(String[] args) {

        // positive number
        int number = 60;

        System.out.print("Factors of " + number + " are: ");

        // loop runs from 1 to 60
        int i = 1;
        int count = 0;
        while (i <= number) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        System.out.print("Total number is : " + count);
    }
}
