package Object;

public  class AppleTree {
    double size;
    String appleColor;
    String type;
    int age;
    String harvestingMonth;  
}

class programAT{
    public static void main(String[] args){
        AppleTree at;
        at = new AppleTree();   

        at.size = 1.2;
        at.appleColor = "Golden";
        at.type = "Bush";
        at.age = 10;
        at.harvestingMonth = "April";

        System.out.println(at.size);
        System.out.println(at.appleColor);
        System.out.println(at.type);
        System.out.println(at.age);
        System.out.println(at.harvestingMonth);
}
}