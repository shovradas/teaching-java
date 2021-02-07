package Method.IfElse.Number;

public class nestedIf2 {

    static String nest2(int num){
        if ((num>200)||(num<100)||(num%7==0)){
            return (num + " the number meets the requirement");
        } 
        else {
            return (num + " the number doesn't meet the requirement");
        }  
    }

    public static void main(String[] args) {
        System.out.println(nest2(250));        
    }
}

    
