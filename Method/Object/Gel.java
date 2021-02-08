package Method.Object;

public class Gel {
    String nature;
    boolean isFull;
    String material;
    String container;
    double diameter;   
}

class programG{
    static void set(Gel gel, String nature, boolean isFull, String material, String container,  double diameter){
        gel.nature = nature;
        gel.isFull = isFull;
        gel.material = material;
        gel.container = container;
        gel.diameter = diameter;
    }
    static void print(Gel gel){
        System.out.println(gel.nature);
        System.out.println (gel.isFull);
        System.out.println (gel.material);
        System.out.println (gel.container);
        System.out.println (gel.diameter);
    }
    public static void main(String[] args){
    Gel gel1;
    gel1 = new Gel();
    set(gel1, "Liquid", true, "Alovera", "bottle", 3.3);
    print(gel1);  
    }
}
