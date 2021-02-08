package Method.Object;

public class SolerLight {

    String color;
    String shape;
    double diameter;
    int noOfSwitch;
    boolean working;    
}

class programSL{
    public static void main(String[] args){
        SolerLight sl = new SolerLight();
    sl.color = "Blue";
    sl.shape = "Round";
    sl.diameter = 2.3;
    sl.noOfSwitch = 3;
    sl.working = true;

System.out.println(sl.color);
System.out.println(sl.shape);
System.out.println(sl.diameter);
System.out.println(sl.noOfSwitch);
System.out.println(sl.working);
    }
}
