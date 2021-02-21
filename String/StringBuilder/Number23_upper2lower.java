package String.StringBuilder;

public class Number23_upper2lower {
    public static void main(String[] args) {
        
        StringBuilder a = new StringBuilder("HELLO");
        int i = 0;
        char a_char = a.charAt(i);
        
        for(i = 0; i<a.length(); i++)
        {
            if (a.charAt(i) >=65 && a.charAt(i)<=90){
                a_char = (char) (int) (a.charAt(i)+32);
                System.out.print(a_char);
            }
        }
    }
}
