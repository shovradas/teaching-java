package Loops.While.Character;

public class Unicode {
    public static void main(String[] args) {
        String unicL = "U+0980";
        char chL = unicL.charAt(0);
        System.out.println(chL);
        String unicU = "U+09EF";
        char chU = unicU.charAt(0);
        while (chL <= chU) {
            chL++;
            // System.out.println(chL); //https://www.compart.com/en/unicode/block/U+0980
        }
    }
}
