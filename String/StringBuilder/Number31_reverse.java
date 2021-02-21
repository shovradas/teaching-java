package String.StringBuilder;

public class Number31_reverse {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hEllo hobArt");
        //String a = "Hello";
        int i=0;
        char a_char = a.charAt(i);
        int l = a.length() -1;
        
        //System.out.println(a.charAt(0));

        for(i=l; i>=0; i--){
            a.setCharAt(a_char, a.charAt(i));
            System.out.println(a.charAt(i));
        }
        
    }
}
