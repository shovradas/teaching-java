package Method.Object;

public class Monitor {
    int size;
    String type;
    String color;
    boolean haveUSB;
}

class programM{
    public static void main(String[] args){
        Monitor m = new Monitor();
            m.size = 23;
            m.type = "LED";
            m.color = "Black";
            m.haveUSB = true;

            System.out.println(m.size);
            System.out.println (m.type);
            System.out.println(m.color);
            System.out.println(m.haveUSB);

    }
}
