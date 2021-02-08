package Method.Object;

public class ChilliPlant {

    int noOfLeaves;
    Boolean haveChillis;
    int noOfChillis;
    String nature;
    double height;
}

class programCT {
    static void set(ChilliPlant chilliPlant, int noOfLeaves, Boolean haveChillis, int noOfChillis, String nature,
            double height) {
        chilliPlant.noOfLeaves = noOfLeaves;
        chilliPlant.haveChillis = haveChillis;
        chilliPlant.noOfChillis = noOfChillis;
        chilliPlant.nature = nature;
        chilliPlant.height = height;
    }

    static void print(ChilliPlant chilliPlant) {
        System.out.println(chilliPlant.noOfLeaves);
        System.out.println(chilliPlant.haveChillis);
        System.out.println(chilliPlant.noOfChillis);
        System.out.println(chilliPlant.nature);
        System.out.println(chilliPlant.height);
    }

    public static void main(String[] args) {
        ChilliPlant chilliPlant1 = new ChilliPlant();
        set(chilliPlant1, 10, true, 3, "Spicy", 1.3);
        print(chilliPlant1);
    }
}