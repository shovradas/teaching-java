package Method.Object;

public class Grape {
    boolean haveFruits;
    String leaveColor;
    String fruitColor;
    int noOfFruits;
    double height;
}

class programGP{
    static void set(Grape grape, boolean haveFruits, String leaveColor, String fruitColor,  int noOfFruits, double height) {
        grape.haveFruits = haveFruits;
        grape.leaveColor = leaveColor;
        grape.fruitColor = fruitColor;
        grape.noOfFruits = noOfFruits;
        grape.height = height;
    }
    static void print(Grape grape) {
        System.out.println("have Fruits? : " + grape.haveFruits);
        System.out.println("leave Color : " + grape.leaveColor);
        System.out.println("fruit Color : " + grape.fruitColor);
        System.out.println("no Of Fruits : " + grape.noOfFruits);
        System.out.println("height : " + grape.height);    
    }
    public static void main(String[] args){

        Grape grape1;
        grape1 = new Grape();
        set(grape1, true, "Green", "Black", 20, 3.3);
        print(grape1);
    }
}