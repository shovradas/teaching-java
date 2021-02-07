package Method.IfElse.Number;

public class MaximumOfThree {

   static String maxNum(int num1, int num2, int num3) {
      if ((num1 >= num2) && (num1 >= num3)) {
         return num1 + " is the maximum number";
      } else if ((num2 >= num1) && (num2 >= num3)) {
         return num2 + " is the maximum number";
      } else {
         return num3 +" is the maximum number";
      }
   }
   public static void main(String[] args) {
      System.out.println(maxNum(2, 4, 6));
   }
}
