package Method.Object;

public class Laptop {
    int ramInGB;
    String processor;
    int Windows;
    int corei;
    String brand;
}

class programL {
    static void set(Laptop laptop, int ramInGB, String processor, int Windows, int corei, String brand) {
        laptop.ramInGB = ramInGB;
        laptop.processor = processor;
        laptop.Windows = Windows;
        laptop.corei = corei;
        laptop.brand = brand;
    }

    static void print(Laptop laptop) {
        System.out.println(laptop.ramInGB);
        System.out.println(laptop.processor);
        System.out.println(laptop.Windows);
        System.out.println(laptop.corei);
        System.out.println(laptop.brand);
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        set(laptop1, 8, "Intel", 10, 5, "Asus");
        print(laptop1);
    }
}