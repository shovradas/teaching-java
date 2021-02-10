package Loops.While.Number;

//https://www.geeksforgeeks.org/java-program-to-check-if-a-given-number-is-perfect-number/#:~:text=A%20Simple%20Solution%20is%20to,a%20perfect%20number%20otherwise%20not.
//Write a program to check a number whether it is perfect or not.
public class perfectNum {
    static boolean isPerfect(int perNumber) {
        if (perNumber == 1) { // 1 is not a perfect number
            return false;
        }
        int sum = 1;// sum of all dividers and 1 is divider of all numbers

        int i = 2; // 1 is divisors so i starting with 2
        while (i <= perNumber) {
            if (perNumber % i == 0) { // perNumber i dia vag hole e sum korbe
                sum += i;
            }
            i++;
        }
        if (sum == perNumber) { // vag jay amon sob sonkhar jogfol jodi sei vag dea sonkhatar soman hoy
            return true;
        }

        return false; // static boolean isPerfect(int perNumber) ei function er return
    }

    // Driver program
    public static void main(String[] args) {
        int perNumber = 6;
        if (isPerfect(perNumber))
            System.out.println(perNumber + " is a perfect number");
        else
            System.out.println(perNumber + " is not a perfect number");
    }

}