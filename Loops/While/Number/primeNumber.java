package Loops.While.Number;


public class primeNumber {
    public static void main(String[] args) {

        int num = 13, i = 2;
        //boolean flag = false;
        int a = num/2;
        boolean prime_number = true;
        System.out.println(a);
         while (i <= num/2) //because a number is not divisible by more than its half.
        {
        // condition for nonprime number
            if (num % i == 0) {
           prime_number = true;
          }
            ++i;
         }
    
        if (!prime_number)
          System.out.println(num + " is a prime number.");
         else
           System.out.println(num + " is not a prime number.");
      }
    }
    