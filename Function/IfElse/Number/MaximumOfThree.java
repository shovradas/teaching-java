package IfElse.Number;

public class MaximumOfThree {
    public static void main(String[] args) {
     int a = 5;
     int b = 3;
     int c = 7;
     
     if ((a>=b)&&(a>=c)){
        System.out.println(a + " contains the maximum number");
     }
     else if ((b>=a)&&(b>=c)){
        System.out.println(b + " contains the maximum number");
     }
     else {
        System.out.println(c + " contains the maximum number");
     }
    }
}
