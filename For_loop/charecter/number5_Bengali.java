package For_loop.charecter;

public class number5_Bengali {
    public static void main(String[] args) {
        String unicL = "\u0980";
        char chL = unicL.charAt(0);
        // System.out.println(chL);
        String unicU = "\u09EF";
        char chU = unicU.charAt(0);
        for (; chL <= chU; chL++) {
            System.out.println(chL); // https://www.compart.com/en/unicode/block/U+0980
        }
    }
}
