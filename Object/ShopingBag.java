package Object;

public class ShopingBag {
    String shop;
    String metarial;
    String color;
    boolean isUsed;
}
class programSB{
    public static void main(String[] args){
        ShopingBag sb = new ShopingBag();
    sb.shop = "AAA";
    sb.metarial = "Paper";
    sb.color = "Brown";
    sb.isUsed = true;

    System.out.println(sb.shop);
    System.out.println(sb.metarial);
    System.out.println(sb.color);
    System.out.println(sb.isUsed);
    }
}