package Object;

public class Grape {
    boolean haveFruits;
    String leaveColor;
    String fruitColor;
    int noOfFruits;
    double height;
}

class programGP{
    public static void main(String[] args){

        Grape gp;
        gp = new Grape();

            gp.haveFruits = true;
            gp.leaveColor = "Green";
            gp.fruitColor = "Black";
            gp.noOfFruits = 20;
            gp.height = 3.3;
        
        System.out.println(gp.haveFruits);
        System.out.println(gp.leaveColor);
        System.out.println(gp.fruitColor);
        System.out.println(gp.noOfFruits);
        System.out.println(gp.height);
    }
}