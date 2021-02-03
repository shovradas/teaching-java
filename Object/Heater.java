package Object;

public class Heater {
    
    int noOfButton;
    String brand;
    int temparature;
    String type;
    boolean isGood;
}

class programH{
    public static void main(String[] args){
        Heater h = new Heater();
        h.noOfButton = 4;
        h.brand = "Fuzi";
        h.temparature = 1200;
        h.type = "Oil";
        h.isGood = true;

    System.out.println(h.noOfButton);
    System.out.println(h.brand);
    System.out.println(h.temparature);
    System.out.println(h.type);
    System.out.println(h.isGood);

}
}