package Object;

public class Perfume {

    String brand;
    String color;
    String metarial;
    int noOfPerfume;
    boolean isGood;  
}
class programP{
    public static void main(String[] args){
        Perfume p = new Perfume();
    p.brand = "Arman";
    p.color = "Pink";
    p.metarial = "Liq";
    p.noOfPerfume = 3;
    p.isGood = true;

    System.out.println(p.brand);
    System.out.println(p.color);
    System.out.println(p.metarial);
    System.out.println(p.noOfPerfume);
    System.out.println(p.isGood);
    }
}