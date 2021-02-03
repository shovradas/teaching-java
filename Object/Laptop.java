package Object;

public class Laptop {
    int ramInGB;
    String processor;
    int Windows;
    int corei;
    String brand;
}

class programL{
    public static void main(String[] args){
        Laptop l = new Laptop();  
    l.ramInGB = 8;
    l.processor = "Intel";
    l.Windows = 10;
    l.corei = 5;
    l.brand = "Asus";

    System.out.println(l.ramInGB);
    System.out.println(l.processor);
    System.out.println(l.Windows);
    System.out.println(l.corei);
    System.out.println(l.brand);
    }
}