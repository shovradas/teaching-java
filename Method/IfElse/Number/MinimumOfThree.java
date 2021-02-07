package Method.IfElse.Number;

public class MinimumOfThree {

   static String minNum( int num1, int num2, int num3){
      if ((num1<=num2)&&(num1<=num3)){
         return (num1 + " contains the minimum number");
      }
      else if ((num2<=num1)&&(num2<=num3)){
         return (num2 + " contains the minimum number");
      }
      else {
         return (num3 + " contains the minimum number");
      }
   }
    public static void main(String[] args) {
        System.out.println(minNum(2,-7,1));
       }
}
