package Function.IfElse.Number;

public class MaximumOfThree {

   static void maxNum(int a, int b, int c) {
      if ((a >= b) && (a >= c)) {
         System.out.println(a + " is the maximum number");
      } else if ((b >= a) && (b >= c)) {
         System.out.println(b + " is the maximum number");
      } else {
         System.out.println(c + " is the maximum number");
      }
   }

   public static void main(String[] args) {
      int a = 5;
      int b = 3;
      int c = 7;
      maxNum(1,4,3);
   }
}
