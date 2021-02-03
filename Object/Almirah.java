package Object;

public class Almirah {
    int door;
    double width;
    Boolean isUsed;
    String type;
    int selves;
}

class programA{
    public static void main(String[] args){
        Almirah a;
        a = new Almirah();

        a. door = 3;
        a.width = 2;
        a.isUsed = true;
        a.type = "wooden";
        a.selves = 10;

        System.out.println("Door no. : " + a.door);
        System.out.println("Width : " + a.width);
        System.out.println("isUsed : " + a.isUsed);
        System.out.println("Type : " + a.type);
        System.out.println("No. of Selves : " + a.selves);
    }}