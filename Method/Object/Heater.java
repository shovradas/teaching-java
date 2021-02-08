package Method.Object;

public class Heater {

    int noOfButton;
    String brand;
    int temparature;
    String type;
    boolean isGood;
}

class programH {

    static void set(Heater heater, int noOfButton, String brand, int temparature, String type, boolean isGood) {
        heater.noOfButton = noOfButton;
        heater.brand = brand;
        heater.temparature = temparature;
        heater.type = type;
        heater.isGood = isGood;
    }

    static void print(Heater heater) {
        System.out.println(heater.noOfButton);
        System.out.println(heater.brand);
        System.out.println(heater.temparature);
        System.out.println(heater.type);
        System.out.println(heater.isGood);
    }

    public static void main(String[] args) {
        Heater heater1 = new Heater();
        set(heater1, 4, "Fuzi", 1200, "oil", true);
        print(heater1);
    }
}