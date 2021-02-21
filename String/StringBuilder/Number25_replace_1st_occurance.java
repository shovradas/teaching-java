package String.StringBuilder;
//Write a program that will replace the first occurrence of a given character with an asterisk(*) in a given string and print.
public class Number25_replace_1st_occurance {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hello hobart");
        char given_char='l';
        int i = 0;
        //int count = 0;
        for(i = 0;i < a.length()-1;i++){
            if(a.charAt(i)==given_char){
            
                a.setCharAt(i, '*'); // str1[0] = 'H'
            }
        } 
        System.out.println(a);
    }   
}
