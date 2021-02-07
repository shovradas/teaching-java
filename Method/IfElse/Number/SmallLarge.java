package Method.IfElse.Number;

public class SmallLarge {
    static String sl(int num1, int num2){
        if (num1<num2){
            return (num2 + " is larger than " + num1);
        }
        else{
           return (num1 + " is larger than " + num2);
        }
    }
    public static void main(String[] args) {
        System.out.println(sl(5,10));
    }
}
