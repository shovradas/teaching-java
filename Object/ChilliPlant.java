package Object;

public class ChilliPlant {

    int noOfLeaves;
    Boolean haveChillis;
    int noOfChillis;
    String nature;
    double height;        
}
class programCT{
    public static void main(String[] args){
        ChilliPlant ct;
        ct = new ChilliPlant();

        ct.noOfLeaves = 10;
        ct.haveChillis = true;
        ct.noOfChillis = 3;
        ct.nature = "Spicy";
        ct.height = 1.3;

        System.out.println(ct.noOfLeaves);
        System.out.println(ct.haveChillis);
        System.out.println(ct.noOfChillis);
        System.out.println(ct.nature);
        System.out.println(ct.height);
    }
}