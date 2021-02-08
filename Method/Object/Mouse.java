package Method.Object;

class Mouse{
    String color;
    int noOfButton;
    String type;
}

class ProgramMM{
    static void set(Mouse mouse, String color, int noOfButton, String type){
        mouse.color = color;
        mouse.noOfButton = noOfButton;
        mouse.type = type; 
    }

    static void print(Mouse mouse){
        System.out.println(mouse.color); // get+print
        System.out.println(mouse.noOfButton);
        System.out.println(mouse.type);
    }

    public static void main(String[] args){        
        Mouse mouse1;  // reference variable
        mouse1 = new Mouse(); // object

        // Set values of attributes      
        // mouse1.color = "balck";
        // mouse1.noOfButton = 3;
        // mouse1.type = "WIRELESS";   

        // get values of attributes and print
        // System.out.println(mouse1.color); // get+print
        // System.out.println(mouse1.noOfButton);
        // System.out.println(mouse1.type);

        set(mouse1, "balck", 3, "WIRELESS"); 
        print(mouse1);

        Mouse mouse2;
        mouse2 = new Mouse();
        set(mouse2, "red", 4, "WIRED");
        print(mouse2);

    }
}