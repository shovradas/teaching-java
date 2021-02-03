package Object;

public class DressingTable {
    Boolean haveMirror;
    double height;
    double width;
    int noOfDrawers;
    String madeWith;    
}

class programDT{
    public static void main(String[] args){
        DressingTable dt;
        dt = new DressingTable();

    dt.haveMirror = true;
    dt.height = 1.5;
    dt.width = 1.0;
    dt.noOfDrawers = 5;
    dt.madeWith = "Wood";


    System.out.println(dt.haveMirror);
    System.out.println(dt.height);
    System.out.println(dt.width);
    System.out.println(dt.noOfDrawers);
    System.out.println(dt.madeWith);
    }
}