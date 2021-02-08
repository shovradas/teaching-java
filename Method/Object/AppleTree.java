package Method.Object;

public class AppleTree {
    double size;
    String appleColor;
    String type;
    int age;
    String harvestingMonth;
}

class programAT {
    static Void set(AppleTree appleTree, double size, String appleColor, String type, int age, String harvestingMonth) {
        appleTree.size = size;
        appleTree.appleColor = appleColor;
        appleTree.type = type;
        appleTree.age = age;
        appleTree.harvestingMonth = harvestingMonth;
        return null;
    }

    static void print(AppleTree appleTree) {
        System.out.println(appleTree.size);
        System.out.println(appleTree.appleColor);
        System.out.println(appleTree.type);
        System.out.println(appleTree.age);
        System.out.println(appleTree.harvestingMonth);
    }

    public static void main(String[] args) {

        AppleTree appleTree1;
        appleTree1 = new AppleTree();
        set(appleTree1, 11.50, "red", "bush", 15, "April");
        print(appleTree1);
    }
}