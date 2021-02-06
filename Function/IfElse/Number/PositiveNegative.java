//  Write a program to find a given number is positive or negative.
package Function.IfElse.Number;

public class PositiveNegative {
    static void posNeg(int a){
        if (a >= 0){
            System.out.println("this integer represents a positive value");
        }
        else{
            System.out.println("this integer represents a negative value");
        }
    }
    public static void main(String[] args) {
    int a = -20;
    posNeg(a);
}
}
