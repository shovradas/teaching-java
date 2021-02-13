package For_loop;

import java.util.Scanner;

public class number27_prime {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        scanner.close();
        boolean prime_number;

        for(int i=1; i <= num / 2; i++) // because a number is not divisible by more than its half.
        {
          if (num % i == 0) {  //num%1; num%2; num%3; num%4; num%5; num%6 ...num%(num/2) -> loop
            prime_number = false;
          }
        }
    
        if (prime_number=true)
          System.out.println(num + " is a prime number.");
        else
          System.out.println(num + " is not a prime number.");
      }
    }
    
