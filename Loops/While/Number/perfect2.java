package Loops.While.Number;

//Write a program that will print all the perfect numbers between 1 to 1000.

public class perfect2 {
    public static void main(String[] args) {
         // positive number
         int number = 1;            
         // loop runs from 1 to given number
         int i = 1;
         int sum = 0;
         while (number<= 1000) {
             if (number % i == 0) {
                number++;
                 sum = sum +i;
             }
             i++;
            }
         if (sum == number){
             System.out.println(number);
         }
         
        }
     
    }

