package Object;

public class Gel {
    String nature;
    boolean isFull;
    String material;
    String container;
    double diameter;   
}

class programG{
    public static void main(String[] args){
    Gel g;
    g = new Gel();
        g.nature = "Liquid";
        g.isFull = true;
        g.material = "Alovera";
        g.container = "bottle";
        g.diameter = 3.3;

        System.out.println(g.nature);
        System.out.println (g.isFull);
        System.out.println (g.material);
        System.out.println (g.container);
        System.out.println (g.diameter);
    
    }
}
