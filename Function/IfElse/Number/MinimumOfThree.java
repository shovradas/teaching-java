package Function.IfElse.Number;

public class MinimumOfThree {

   static void minNum( int a, int b, int c){
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
    public static void main(String[] args) {
        int a = -2;
        int b = -7;
        int c = 10;
        minNum(a,b,c);
       }
}
