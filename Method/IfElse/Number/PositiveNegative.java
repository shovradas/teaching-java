//  Write a program to find a given number is positive or negative.
package Method.IfElse.Number;

public class PositiveNegative {
    static String posNeg(int num){
        if (num >= 0){
            return "this integer represents a positive value";
        }
        else{
            return "this integer represents a negative value";
        }
    }
    public static void main(String[] args) {
    System.out.println(posNeg(-10));
}
}
