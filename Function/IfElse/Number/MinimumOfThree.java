package IfElse.Number;

public class MinimumOfThree {
    public static void main(String[] args) {
        int a = -2;
        int b = -7;
        int c = 10;
        
        if ((a<=b)&&(a<=c)){
           System.out.println(a + " contains the minimum number");
        }
        else if ((b<=a)&&(b<=c)){
           System.out.println(b + " contains the minimum number");
        }
        else {
           System.out.println(c + " contains the minimum number");
        }
       }
}
