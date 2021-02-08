package Method.Object;

public class Lotion {
    double weigtInLittre;
    String bottleColor;
    double height;
    String name;
    Boolean isFull;
}
class program{
    public static void main(String[] args){
        Lotion e;
        e = new Lotion();
        e.weigtInLittre = 1.0;
        e.bottleColor = "Pink";
        e.height = 0.63;
        e.name = "Vitamin E";
        e.isFull = false;

        System.out.println("Weight : " + e.weigtInLittre);
        System.out.println("Color : " + e.bottleColor);
        System.out.println("Height : " + e.height);
        System.out.println("Name : " + e.name);
        System.out.println("Status : " +e.isFull);
    } }
