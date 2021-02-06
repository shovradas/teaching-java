package Function.IfElse.Number;

public class nestedIf2 {

    static void nest2(int a){
        if ((a>200)||(a<100)||(a%7==0)){
            System.out.println("the number meets the requirement");
        } 
        else {
            System.out.println("the number doesn't meet the requirement");
        }  
    }

    public static void main(String[] args) {
        int a =250;
        nest2(a);        
    }
}

    
