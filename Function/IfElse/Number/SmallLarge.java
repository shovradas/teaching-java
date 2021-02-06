package Function.IfElse.Number;

public class SmallLarge {
    static void sl(int a, int b){
        if (a<b){
            System.out.println(b + " is larger than " + a);
        }
        else{
            System.out.println(a + " is larger than " + b);
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        sl(a,b);
    }
}
