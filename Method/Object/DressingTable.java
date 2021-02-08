package Method.Object;

public class DressingTable {
    Boolean haveMirror;
    double height;
    double width;
    int noOfDrawers;
    String madeWith;
}

class programDT {

    static void set(DressingTable dressingTable, Boolean haveMirror, double height, double width, int noOfDrawers,
            String madeWith) {
        dressingTable.haveMirror = haveMirror;
        dressingTable.height = height;
        dressingTable.width = width;
        dressingTable.noOfDrawers = noOfDrawers;
        dressingTable.madeWith = madeWith;
    }

    static void print(DressingTable dressingTable) {
        System.out.println(dressingTable.haveMirror);
        System.out.println(dressingTable.height);
        System.out.println(dressingTable.width);
        System.out.println(dressingTable.noOfDrawers);
        System.out.println(dressingTable.madeWith);
    }

    public static void main(String[] args) {
        DressingTable dressingTable1;
        dressingTable1 = new DressingTable();
        set(dressingTable1, true, 1.5, 1.0, 5, "wood");
        print(dressingTable1);
    }
}