package Variables_DataTypes;
public class TypeCasting {
    public static void main(String[] args) {   
    int x;  // declares a interger variable
    x = 15;
    System.out.println("Double Value : "+(double)x);
    double y = 15.0000000000008;
    System.out.println("Float Value : " + (float)y);
    float z =  13.00f;
    System.out.println("Long Vlaue : " + (long)z);
    Long l = (long)y; // Double to Long
    System.out.println("Long Value : " + l);
   
    System.out.println(" Int value : " + (int)z); // Float to int
    
    //int m = (int)l; // Cannot cast from Long to intJava(16777372)
    //System.out.println("Int Vlaue : " + (int)l);//Cannot cast from int to LongJava(167773
    
    int j = 214748364;
    System.out.println("Short Vlaue : " + (short)j);
    //Short s = 3276;
    //System.out.println("Int Vlaue : " + (byte)s); //Cannot cast from Short to byteJava(16777372)
    System.out.println("Byte Vlaue : " + (byte)j); //int to byte
}

}    