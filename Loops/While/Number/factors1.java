package Loops.While.Number;

//Write a program that will print all the factors of a given number.
public class factors1 {
    public static void main(String[] args) {

        // positive number
        int number = 60;

        System.out.print("Factors of " + number + " are: ");

        // loop runs from 1 to 60
        int i = 1;
        while (i <= number) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
