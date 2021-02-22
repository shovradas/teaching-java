package String.StringBuilder;
//Write a program to transform a given string to lowercase and print.
public class Number28_replace_lowercase {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hEllo hobArt");
        int i=0;
        char a_char = a.charAt(i);
        for( i=0;i < a.length();i++){
            if (a.charAt(i) >=65 && a.charAt(i)<=90){
                a_char = (char) (int) (a.charAt(i)+32);
                a.setCharAt(i, a_char);  
            } 
            if(a.charAt(i) == ' '){
                System.out.print( ' ');
            }
        }
        System.out.println(a);
    }
}
