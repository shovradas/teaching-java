package String.StringBuilder;

public class Number24_replace_char {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hello hobart");
        char given_char='h';
        int i = 0;
        for(i = 0;i < a.length()-1;i++){
            if(a.charAt(i)==given_char){
               a.setCharAt(i, '*'); // str1[0] = 'H'
            }
        }
        System.out.println(a);
    }
}
