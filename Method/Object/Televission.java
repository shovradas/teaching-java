package Method.Object;

public class Televission {
    
        String type;
        String brand;
        int size;
        int noOfRemote;
        boolean Smart;    
    }
    
    class programTV{
        public static void main(String[] args){
            Televission tl = new Televission();
        tl.type = "LED";
        tl.brand = "TCL";
        tl.size = 40;
        tl.noOfRemote = 2;
        tl.Smart = true;
    
    System.out.println(tl.type);
    System.out.println(tl.brand);
    System.out.println(tl.size);
    System.out.println(tl.noOfRemote);
    System.out.println(tl.Smart);
        }
    }   

